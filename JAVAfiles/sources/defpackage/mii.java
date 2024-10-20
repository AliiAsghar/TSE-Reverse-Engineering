package defpackage;

import com.android.vcard.VCardConstants;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mii {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger");
    public final Optional b;
    public final abpo c;
    private final oay d;
    private final armf e;
    private final anen f;
    private final anen g;
    private final anen h;
    private final lpg i;

    public mii(Optional optional, abpo abpoVar, oay oayVar, lpg lpgVar, armf armfVar, anen anenVar, anen anenVar2, anen anenVar3) {
        this.b = optional;
        this.c = abpoVar;
        this.d = oayVar;
        this.i = lpgVar;
        this.e = armfVar;
        this.f = anenVar;
        this.g = anenVar2;
        this.h = anenVar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ int d(String str) {
        char c;
        switch (str.hashCode()) {
            case 2100:
                if (str.equals("AU")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2128:
                if (str.equals("BR")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 75532016:
                if (str.equals(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 9;
            case '\t':
                return 10;
            case '\n':
                return 11;
            case 11:
                return 12;
            case '\f':
                return 13;
            case '\r':
                return 14;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ int e(String str) {
        char c;
        switch (str.hashCode()) {
            case -1712043046:
                if (str.equals("SAMSUNG")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1706170181:
                if (str.equals("XIAOMI")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1114704827:
                if (str.equals("TECNOMOBILELIMITED")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -602397472:
                if (str.equals("ONEPLUS")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2427:
                if (str.equals("LG")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2432928:
                if (str.equals("OPPO")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2634924:
                if (str.equals("VIVO")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 75532016:
                if (str.equals(VCardConstants.PARAM_PHONE_EXTRA_TYPE_OTHER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 433141802:
                if (str.equals("UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 631084431:
                if (str.equals("MOTOROLA")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2090691650:
                if (str.equals("HMDGLOBAL")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2108052025:
                if (str.equals("GOOGLE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 9;
            case '\t':
                return 10;
            case '\n':
                return 11;
            case 11:
                return 12;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final void f(akrh akrhVar, anen anenVar) {
        akul ah = aktp.ah(new kut(this, 16), anenVar);
        akrhVar.b(ah);
        qiu.h(ah);
    }

    public final alog a() {
        int i;
        Integer valueOf = Integer.valueOf(d(this.i.o()) - 1);
        int e = e(lpg.p()) - 1;
        armf armfVar = this.e;
        Integer valueOf2 = Integer.valueOf(e);
        if (true != ((adjc) armfVar.b()).c().c()) {
            i = 3;
        } else {
            i = 2;
        }
        return alog.t(valueOf, valueOf2, Integer.valueOf(i - 1));
    }

    public final void b() {
        akrh e;
        if (((Boolean) ((utz) mik.c.get()).e()).booleanValue()) {
            if (this.b.isPresent()) {
                e = aktp.e("ActiveUserActionCobaltLogger::logCobaltActiveUserMetric");
                try {
                    if (((Boolean) ((utz) mik.f.get()).e()).booleanValue()) {
                        f(e, this.g);
                    } else if (((Boolean) ((utz) mik.e.get()).e()).booleanValue()) {
                        f(e, this.h);
                    } else {
                        f(e, this.f);
                    }
                    e.close();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.d.a()) {
                e = aktp.e("ActiveUserActionCobaltLogger::logCobaltActiveUserMetricGmsCore");
                try {
                    akul ai = aktp.ai(new mig(this, 0), this.h);
                    e.b(ai);
                    qiu.h(ai);
                    e.close();
                } finally {
                    try {
                        e.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
        }
    }

    public final void c(boolean z) {
        if (z) {
            b();
        }
    }
}
