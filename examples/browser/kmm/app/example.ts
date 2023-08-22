import * as kmm from 'kmmdemo';

type KMMResult<T, E> = kmm.io.github.henryquan.kmmdemo.errors.KMMResult<T, E>;
type SharedError = kmm.io.github.henryquan.kmmdemo.errors.SharedError;
const ErrorExample = kmm.io.github.henryquan.kmmdemo.errors.ErrorExample;
const IpLocation = kmm.io.github.henryquan.kmmdemo.models.IpLocation;
type IpLocation = kmm.io.github.henryquan.kmmdemo.models.IpLocation;
const JSONUtil = kmm.io.github.henryquan.kmmdemo.models.JSONUtil;

export default class Example {
    constructor() {
        console.log('Example constructor');
    }

    public resultExample(): KMMResult<string, SharedError> {
        const success = ErrorExample.returnResultSuccess();
        const fail = ErrorExample.returnResultFailure();
        return success;
    }

    public throwExample(): void {
        try {
            ErrorExample.throwSharedError();
        } catch (e) {
            console.log('Caught error: ' + e);
        }

        try {
            ErrorExample.throwGeneric('Generic error');
        } catch (e) {
            console.log('Caught error: ' + e);
        }

        try {
            ErrorExample.throwErrorCode(404);
        } catch (e) {
            console.log('Caught error: ' + e);
        }
    }

    private json = "{\"status\":\"success\",\"country\":\"Australia\",\"countryCode\":\"AU\",\"region\":\"NSW\",\"regionName\":\"New South Wales\",\"city\":\"Sydney\",\"zip\":\"2000\",\"lat\":-33.8715,\"lon\":151.2006,\"timezone\":\"Australia/Sydney\",\"isp\":\"TPG Internet Pty Ltd\",\"org\":\"iiNet Limited\",\"as\":\"AS7545 TPG Telecom Limited\",\"query\":\"1.2.3.4\"}";
    public parseModel(): IpLocation {
        const IpLocation = JSONUtil.decodeIpLocation(this.json);
        return IpLocation;
    }
}
