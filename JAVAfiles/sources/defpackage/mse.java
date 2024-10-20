package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mse implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mse(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [msh, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        msy msyVar = null;
        switch (this.b) {
            case 0:
                return this.a.F();
            case 1:
                return this.a.n();
            case 2:
                msg msgVar = (msg) this.a;
                return (String) ((Optional) msgVar.e.get()).map(new mqm(13)).orElse((String) msgVar.b.get());
            case 3:
                return (String) ((Optional) ((msg) this.a).d.get()).orElse(null);
            case 4:
                return ((msf) ((msg) this.a).c.get()).a;
            case 5:
                return (String) ((Optional) ((msg) this.a).e.get()).map(new mqm(13)).orElse(null);
            case 6:
                return this.a.c();
            case 7:
                String k = this.a.k();
                k.getClass();
                return k;
            case 8:
                return this.a.n();
            case 9:
                return this.a.e();
            case 10:
                return this.a.a();
            case 11:
                return this.a.b();
            case 12:
                return this.a.f();
            case 13:
                switch (((msz) this.a).c) {
                    case 0:
                        msyVar = msy.UNKNOWN_DESTINATION_TYPE;
                        break;
                    case 1:
                        msyVar = msy.PHONE_E164;
                        break;
                    case 2:
                        msyVar = msy.EMAIL;
                        break;
                    case 3:
                        msyVar = msy.BOT;
                        break;
                    case 4:
                        msyVar = msy.UNKNOWN_SENDER;
                        break;
                    case 5:
                        msyVar = msy.PHONE_SHORT_NO_COUNTRY;
                        break;
                    case 6:
                        msyVar = msy.PHONE_SHORT_WITH_COUNTRY;
                        break;
                    case 7:
                        msyVar = msy.PHONE_EMERGENCY;
                        break;
                    case 8:
                        msyVar = msy.PHONE_LOCAL_WITH_COUNTRY;
                        break;
                    case 9:
                        msyVar = msy.PHONE_LOCAL_NO_COUNTRY;
                        break;
                    case 10:
                        msyVar = msy.PHONE_NATIONAL;
                        break;
                    case 11:
                        msyVar = msy.SATELLITE_ESP;
                        break;
                    case 12:
                        msyVar = msy.PENPAL_BOT;
                        break;
                    case 13:
                        msyVar = msy.ALPHA_SHORT_NO_COUNTRY;
                        break;
                    case 14:
                        msyVar = msy.ALPHA_SHORT_WITH_COUNTRY;
                        break;
                }
                if (msyVar == null) {
                    return msy.UNRECOGNIZED;
                }
                return msyVar;
            case 14:
                return this.a;
            case 15:
                return this.a;
            case 16:
                return ((msz) this.a).d;
            case 17:
                return ((msz) this.a).k;
            case 18:
                return this.a;
            case 19:
                return ((msz) this.a).e;
            default:
                return ((msz) this.a).h;
        }
    }
}
