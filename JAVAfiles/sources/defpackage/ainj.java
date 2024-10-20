package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainj extends ainh {
    public final aimx a;
    public int m;

    public ainj(int i, String str) {
        super(2);
        this.a = new aimx(i, str);
    }

    public static String y(int i) {
        if (i != 420) {
            if (i != 421) {
                if (i != 603) {
                    if (i != 604) {
                        switch (i) {
                            case VCardConstants.DEFAULT_PREF /* 100 */:
                                return "Trying";
                            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                                return "OK";
                            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                return "Accepted";
                            case 305:
                                return "Use proxy";
                            case 380:
                                return "Alternative service";
                            case 410:
                                return "Gone";
                            case 423:
                                return "Interval too brief";
                            case 477:
                                return "Send Failed";
                            case 491:
                                return "Request Pending";
                            case 493:
                                return "Undecipherable";
                            case 513:
                                return "Message Too Large";
                            case 600:
                                return "Busy everywhere";
                            case 606:
                                return "Session Not acceptable";
                            default:
                                switch (i) {
                                    case 180:
                                        return "Ringing";
                                    case 181:
                                        return "Call is being forwarded";
                                    case 182:
                                        return "Queued";
                                    case 183:
                                        return "Session progress";
                                    default:
                                        switch (i) {
                                            case 300:
                                                return "Multiple choices";
                                            case 301:
                                                return "Moved permanently";
                                            case 302:
                                                return "Moved Temporarily";
                                            default:
                                                switch (i) {
                                                    case 400:
                                                        return "Bad request";
                                                    case 401:
                                                        return "Unauthorized";
                                                    case 402:
                                                        return "Payment required";
                                                    case 403:
                                                        return "Forbidden";
                                                    case 404:
                                                        return "Not found";
                                                    case 405:
                                                        return "Method not allowed";
                                                    case 406:
                                                        return "Not acceptable";
                                                    case 407:
                                                        return "Proxy Authentication required";
                                                    case 408:
                                                        return "Request timeout";
                                                    default:
                                                        switch (i) {
                                                            case 413:
                                                                return "Request entity too large";
                                                            case 414:
                                                                return "Request-URI too large";
                                                            case 415:
                                                                return "Unsupported media type";
                                                            case 416:
                                                                return "Unsupported URI Scheme";
                                                            default:
                                                                switch (i) {
                                                                    case 480:
                                                                        return "Temporarily Unavailable";
                                                                    case 481:
                                                                        return "Call leg/Transaction does not exist";
                                                                    case 482:
                                                                        return "Loop detected";
                                                                    case 483:
                                                                        return "Too many hops";
                                                                    case 484:
                                                                        return "Address incomplete";
                                                                    case 485:
                                                                        return "Ambiguous";
                                                                    case 486:
                                                                        return "Busy here";
                                                                    case 487:
                                                                        return "Request Terminated";
                                                                    case 488:
                                                                        return "Not Acceptable here";
                                                                    case 489:
                                                                        return "Bad Event";
                                                                    default:
                                                                        switch (i) {
                                                                            case 500:
                                                                                return "Internal Server Error";
                                                                            case 501:
                                                                                return "Not implemented";
                                                                            case 502:
                                                                                return "Bad gateway";
                                                                            case 503:
                                                                                return "Service unavailable";
                                                                            case 504:
                                                                                return "Gateway timeout";
                                                                            case 505:
                                                                                return "SIP version not supported";
                                                                            default:
                                                                                return "";
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                    return "Does not exist anywhere";
                }
                return "Decline";
            }
            return "Extension Required";
        }
        return "Bad extension";
    }

    @Override // defpackage.ainh
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        this.a.b(stringBuffer);
        super.l(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // defpackage.ainh
    public final byte[] b() {
        byte[] bytes = this.a.a().getBytes(StandardCharsets.UTF_8);
        byte[] b = super.b();
        if (b != null && bytes != null) {
            byte[] bArr = new byte[bytes.length + b.length];
            int i = 0;
            while (i < bytes.length) {
                bArr[i] = bytes[i];
                i++;
            }
            for (byte b2 : b) {
                bArr[i] = b2;
                i++;
            }
            return bArr;
        }
        return null;
    }

    @Override // defpackage.ainh
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ainj) && this.a.equals(((ainj) obj).a)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ainh
    public final int hashCode() {
        return (super.hashCode() * 37) + this.a.a;
    }

    public final String toString() {
        return a();
    }

    public final int w() {
        return this.a.a;
    }

    public final String x() {
        return this.a.b;
    }

    public final boolean z() {
        int i = this.a.a;
        if (i >= 200 && i < 700) {
            return true;
        }
        return false;
    }

    public ainj(aimx aimxVar) {
        super(2);
        this.a = aimxVar;
    }
}
