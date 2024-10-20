package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aenh extends arrp implements arqv {
    final /* synthetic */ aenw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ aeoa c;
    final /* synthetic */ boolean d;
    final /* synthetic */ aeoo e;
    final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aenh(aenw aenwVar, boolean z, aeoa aeoaVar, boolean z2, aeoo aeooVar, float f) {
        super(2);
        this.a = aenwVar;
        this.b = z;
        this.c = aeoaVar;
        this.d = z2;
        this.e = aeooVar;
        this.f = f;
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Integer valueOf;
        bwj bwjVar = (bwj) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && bwjVar.L()) {
            bwjVar.v();
        } else {
            int ordinal = this.a.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 5) {
                        valueOf = null;
                    } else {
                        valueOf = Integer.valueOf(R.id.compose_input_voice_growthkit_view);
                    }
                } else {
                    valueOf = Integer.valueOf(R.id.compose_input_gallery_growthkit_view);
                }
            } else {
                valueOf = Integer.valueOf(R.id.compose_input_magic_compose_growthkit_view);
            }
            aeke.aH(valueOf, cdk.e(-1855229940, new aeng(this.b, this.a, this.c, this.d, this.e, this.f), bwjVar), bwjVar, 48);
        }
        return arnb.a;
    }
}
