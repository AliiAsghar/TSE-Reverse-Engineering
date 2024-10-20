package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ljl extends arrd implements arqv {
    public static final ljl a = new ljl();

    public ljl() {
        super(2, amfq.class, "setMultiShareEvent", "setMultiShareEvent(Lcom/google/common/logging/bugle/MultiShare$MultiShareEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        amfq amfqVar = (amfq) obj;
        amwc amwcVar = (amwc) obj2;
        amfqVar.getClass();
        amwcVar.getClass();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amwg amwgVar = (amwg) amwcVar.s();
        amfr amfrVar2 = amfr.a;
        amwgVar.getClass();
        amfrVar.bs = amwgVar;
        amfrVar.g |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        return arnb.a;
    }
}
