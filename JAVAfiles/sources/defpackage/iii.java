package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class iii extends arrd implements arqv {
    public static final iii a = new iii();

    public iii() {
        super(2, amfq.class, "setBugleContact", "setBugleContact(Lcom/google/common/logging/BugleProtos$BugleContact$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        amfq amfqVar = (amfq) obj;
        amfa amfaVar = (amfa) obj2;
        amfqVar.getClass();
        amfaVar.getClass();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfb amfbVar = (amfb) amfaVar.s();
        amfr amfrVar2 = amfr.a;
        amfbVar.getClass();
        amfrVar.C = amfbVar;
        amfrVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        return arnb.a;
    }
}
