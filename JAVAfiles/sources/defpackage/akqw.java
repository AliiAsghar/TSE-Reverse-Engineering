package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqw extends akqe {
    public static final UUID a = UUID.randomUUID();

    private akqw(akqw akqwVar, String str, akrl akrlVar, akru akruVar) {
        super(str, akqwVar, akrlVar, akruVar);
    }

    @Override // defpackage.akry
    public final akrl l() {
        return akrk.a;
    }

    @Override // defpackage.akry
    public final akry m(String str, akrl akrlVar, akru akruVar) {
        return new akqw(this, str, akrlVar, akruVar);
    }

    @Override // defpackage.akry
    public final boolean p() {
        return false;
    }

    public akqw(String str, UUID uuid, akrl akrlVar, akru akruVar) {
        super(str, uuid, akrlVar, akruVar);
    }

    @Override // defpackage.akry
    public final void r() {
    }

    @Override // defpackage.akry
    public final void n(int i) {
    }

    @Override // defpackage.akry
    public final void o(boolean z) {
    }

    @Override // defpackage.akry
    public final void s(aktp aktpVar, Object obj) {
    }
}
