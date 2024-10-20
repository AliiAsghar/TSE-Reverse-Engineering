package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jnk implements jnb {
    private final jni a;
    private final jnj b;
    private final jnf c;
    private final jnn d;
    private final jnn e;
    private final jnf f;

    public jnk(jni jniVar, jnj jnjVar, jnf jnfVar, jnn jnnVar, jnn jnnVar2, jnf jnfVar2) {
        this.a = jniVar;
        this.b = jnjVar;
        this.c = jnfVar;
        this.e = jnnVar;
        this.d = jnnVar2;
        this.f = jnfVar2;
    }

    @Override // defpackage.jnb
    public final Object a(jgz jgzVar, jnd jndVar, String str, arpe arpeVar) {
        jnb jnbVar;
        afcq afcqVar = jgzVar.a;
        if (afcqVar instanceof afso) {
            afso afsoVar = (afso) afcqVar;
            if (afsoVar instanceof afto) {
                jnbVar = this.a;
            } else if (afsoVar instanceof aftq) {
                jnbVar = this.b;
            } else if (afsoVar instanceof aftn) {
                jnbVar = this.c;
            } else if (afsoVar instanceof afql) {
                jnbVar = this.e;
            } else if (afsoVar instanceof afxr) {
                jnbVar = this.d;
            } else if (afsoVar instanceof afqc) {
                jnbVar = this.f;
            } else {
                Objects.toString(afsoVar);
                throw new UnsupportedOperationException("Unsupported media: ".concat(afsoVar.toString()));
            }
            return jnbVar.a(jgzVar, jndVar, str, arpeVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
