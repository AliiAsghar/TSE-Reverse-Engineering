package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlb implements atna {
    public List a;
    public int b = 3;

    public atlb() {
        d();
        String[] strArr = ResolverConfig.b().servers;
        if (strArr == null) {
            this.a.add(new atnk(null));
            return;
        }
        for (String str : strArr) {
            atnk atnkVar = new atnk(str);
            atnkVar.c(5);
            this.a.add(atnkVar);
        }
    }

    private final void d() {
        this.a = new ArrayList();
    }

    @Override // defpackage.atna
    public final atlz a(atlz atlzVar) {
        atla atlaVar = new atla(this, atlzVar);
        try {
            int[] iArr = atlaVar.b;
            iArr[0] = iArr[0] + 1;
            atlaVar.e++;
            atlaVar.c[0] = new Object();
            return atlaVar.a[0].a(atlaVar.g);
        } catch (Exception e) {
            atlaVar.a(atlaVar.c[0], e);
            synchronized (atlaVar) {
                while (!atlaVar.f) {
                    try {
                        atlaVar.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                atlz atlzVar2 = atlaVar.h;
                if (atlzVar2 == null) {
                    Throwable th = atlaVar.i;
                    if (!(th instanceof IOException)) {
                        if (!(th instanceof RuntimeException)) {
                            if (th instanceof Error) {
                                throw ((Error) th);
                            }
                            throw new IllegalStateException("ExtendedResolver failure");
                        }
                        throw ((RuntimeException) th);
                    }
                    throw ((IOException) th);
                }
                return atlzVar2;
            }
        }
    }

    @Override // defpackage.atna
    public final Object b(atlz atlzVar, atla atlaVar) {
        atla atlaVar2 = new atla(this, atlzVar);
        atlaVar2.j = atlaVar;
        atlaVar2.b(0);
        return atlaVar2;
    }

    @Override // defpackage.atna
    public final void c(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((atna) this.a.get(i2)).c(i);
        }
    }

    public atlb(atna[] atnaVarArr) {
        d();
        for (atna atnaVar : atnaVarArr) {
            this.a.add(atnaVar);
        }
    }
}
