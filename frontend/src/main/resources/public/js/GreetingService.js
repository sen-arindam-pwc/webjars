export default class GreetingService {
    async greet(name) {
        const response = await fetch('/api/greeting' + this.getParameter(name), {
            method: 'GET',
            headers: {
                'Accept': 'application/json'
            }
        });

        let body = await response.json();

        if (!Object.prototype.hasOwnProperty.call(body, 'message')) {
            throw new Error('Invalid response format; expected JSON object to contain "message" property.');
        }

        return body;
    }

    getParameter(name) {
        return !this.isSet(name) ? '?' + new URLSearchParams({name}) : '';
    }

    isSet(name) {
        return typeof name === 'undefined' || name === null || name === '';
    }
}
