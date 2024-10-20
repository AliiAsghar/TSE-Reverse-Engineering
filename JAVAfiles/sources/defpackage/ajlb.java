package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajlb {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;
    public final List f = new ArrayList();
    private final List g = new ArrayList();

    public ajlb() {
        e();
    }

    private final void g(float f) {
        float f2 = this.d;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.b;
                float f5 = this.c;
                ajkx ajkxVar = new ajkx(f4, f5, f4, f5);
                ajkxVar.e = this.d;
                ajkxVar.f = f3;
                this.g.add(new ajkv(ajkxVar));
                this.d = f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ajla a(Matrix matrix) {
        g(this.e);
        return new ajku(new ArrayList(this.g), new Matrix(matrix));
    }

    public final void b(ajla ajlaVar, float f, float f2) {
        g(f);
        this.g.add(ajlaVar);
        this.d = f2;
    }

    public final void c(Matrix matrix, Path path) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ajkz) this.f.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        ajky ajkyVar = new ajky();
        ajkyVar.a = f;
        ajkyVar.b = f2;
        this.f.add(ajkyVar);
        ajkw ajkwVar = new ajkw(ajkyVar, this.b, this.c);
        b(ajkwVar, ajkwVar.b() + 270.0f, ajkwVar.b() + 270.0f);
        this.b = f;
        this.c = f2;
    }

    public final void e() {
        f(brg.a, 270.0f, brg.a);
    }

    public final void f(float f, float f2, float f3) {
        this.a = f;
        this.b = brg.a;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
