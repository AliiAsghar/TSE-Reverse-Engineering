package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgi extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        amgt amgtVar = (amgt) obj;
        switch (amgtVar) {
            case UNSPECIFIED:
                return tqu.UNKNOWN;
            case TELEPHONY:
                return tqu.TELEPHONY;
            case SLM:
                return tqu.SLM;
            case TELEPHONY_UNSPECIFIED:
                return tqu.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return tqu.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return tqu.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return tqu.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(amgtVar.toString()));
        }
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        tqu tquVar = (tqu) obj;
        switch (tquVar) {
            case UNKNOWN:
                return amgt.UNSPECIFIED;
            case TELEPHONY:
                return amgt.TELEPHONY;
            case SLM:
                return amgt.SLM;
            case TELEPHONY_UNSPECIFIED:
                return amgt.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return amgt.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return amgt.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return amgt.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(tquVar.toString()));
        }
    }
}
