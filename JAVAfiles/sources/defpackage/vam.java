package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vam {
    final /* synthetic */ vao b;
    private atkm c = null;
    private atkm d = null;
    int a = 0;

    public vam(vao vaoVar) {
        this.b = vaoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final van a() {
        vao vaoVar = this.b;
        van vanVar = new van(vaoVar);
        vanVar.a = vaoVar.b;
        vanVar.b = this.a;
        return vanVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        atkm atkmVar = this.d;
        atkmVar.getClass();
        Object obj = atkmVar.b;
        int i = atkmVar.a;
        obj.getClass();
        this.b.c(((ByteArrayOutputStream) obj).toByteArray(), i);
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.d == null) {
            atkm atkmVar = new atkm((byte[]) null, (byte[]) null);
            vao vaoVar = this.b;
            atkmVar.b = vaoVar.a;
            atkmVar.a = vaoVar.b;
            atkmVar.c = this.c;
            this.c = atkmVar;
            this.a++;
            vaoVar.a = new ByteArrayOutputStream();
            this.b.b = 0;
            return;
        }
        throw new RuntimeException("BUG: Invalid copy() before newbuf()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        vao vaoVar = this.b;
        ByteArrayOutputStream byteArrayOutputStream = vaoVar.a;
        int i = vaoVar.b;
        atkm atkmVar = this.c;
        atkmVar.getClass();
        Object obj = atkmVar.b;
        obj.getClass();
        vaoVar.a = (ByteArrayOutputStream) obj;
        vaoVar.b = atkmVar.a;
        this.d = atkmVar;
        this.c = (atkm) atkmVar.c;
        this.a--;
        atkm atkmVar2 = this.d;
        atkmVar2.b = byteArrayOutputStream;
        atkmVar2.a = i;
    }
}
