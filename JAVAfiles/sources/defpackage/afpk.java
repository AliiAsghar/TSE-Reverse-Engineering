package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpk extends arsm {
    final /* synthetic */ afpn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpk(afpn afpnVar) {
        super(null);
        this.a = afpnVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        CharSequence charSequence;
        afpn afpnVar = this.a;
        Integer num = afpnVar.c().c;
        if (num != null) {
            afpnVar.c().q(num.intValue());
        }
        int b = this.a.c().b();
        for (int i = 0; i < b; i++) {
            aflw F = this.a.c().F(i);
            if (F != null) {
                charSequence = F.a();
            } else {
                charSequence = null;
            }
            if (d.F(charSequence, null)) {
                this.a.c().q(i);
                return;
            }
        }
    }

    @Override // defpackage.arsm
    protected final boolean b(Object obj, Object obj2) {
        return d.R(obj, obj2);
    }
}
