package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class afpa implements arrk {
    final /* synthetic */ afpb a;

    public afpa(afpb afpbVar) {
        this.a = afpbVar;
    }

    public final void a(String str, boolean z) {
        afpb afpbVar = this.a;
        arrn.J(afpbVar.bo(), null, null, new afoz(afpbVar, str, z, null), 3);
    }

    @Override // defpackage.arrk
    public final armh b() {
        return new arrm(2, this.a, afpb.class, "onEmojiSelected", "onEmojiSelected(Ljava/lang/String;Z)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof afpa) && (obj instanceof arrk)) {
            return d.F(b(), ((arrk) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
