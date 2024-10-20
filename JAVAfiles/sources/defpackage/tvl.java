package defpackage;

import com.google.communication.synapse.security.scytale.Scope;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tvl {
    public static final xze a = xze.g("BugleEtouffee", "PrekeysManager");
    public final ttb b;
    public final anen c;
    public final apwt d;
    public final uac e;

    public tvl(uac uacVar, ttb ttbVar, anen anenVar, apwt apwtVar) {
        this.e = uacVar;
        this.b = ttbVar;
        this.c = anenVar;
        this.d = apwtVar;
    }

    public final akul a(String str) {
        int intValue = ((Integer) ttd.d.e()).intValue();
        xyo a2 = a.a();
        a2.H("Generating new prekey set");
        a2.x("count", intValue);
        a2.q();
        this.d.b();
        return this.b.a(str).h(new ikg(Scope.create(this.e.b()), intValue, 7), this.c).h(new tvd(4), andi.a);
    }
}
