package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jwm extends arpw implements arqx {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ jwp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwm(String str, String str2, jwp jwpVar, arpe arpeVar) {
        super(4, arpeVar);
        this.c = str;
        this.d = str2;
        this.e = jwpVar;
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        jwm jwmVar = new jwm(this.c, this.d, this.e, (arpe) obj4);
        jwmVar.a = (ResolvedRecipient) obj;
        jwmVar.b = booleanValue;
        return jwmVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        aqil.P(obj);
        Object obj2 = this.a;
        if (!this.b) {
            return null;
        }
        String str = this.c;
        String str2 = this.d;
        jwp jwpVar = this.e;
        return new afal(str, aerb.bk, aqjn.y(new aeie(aein.h, str.length() - str2.length(), str.length(), str, new jpi(jwpVar, obj2, 7, null))), new jwl(this.e, 0));
    }
}
