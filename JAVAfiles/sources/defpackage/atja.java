package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atja {
    public final atfu a;
    public final Locale b;
    public atgc c;
    public Integer d;
    public atiy[] e;
    public int f;
    public boolean g;
    private final atgc h;
    private Object i;

    public atja(atfu atfuVar) {
        atfu c = atfz.c(atfuVar);
        atgc z = c.z();
        this.h = z;
        this.a = c.a();
        this.b = Locale.getDefault();
        this.c = z;
        this.e = new atiy[8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(atgd atgdVar, atgd atgdVar2) {
        if (atgdVar != null && atgdVar.f()) {
            if (atgdVar2 != null && atgdVar2.f()) {
                return -atgdVar.compareTo(atgdVar2);
            }
            return 1;
        }
        if (atgdVar2 != null && atgdVar2.f()) {
            return -1;
        }
        return 0;
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new atiz(this);
        }
        return this.i;
    }

    public final atiy c() {
        atiy[] atiyVarArr = this.e;
        int i = this.f;
        int length = atiyVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            atiy[] atiyVarArr2 = new atiy[length];
            System.arraycopy(atiyVarArr, 0, atiyVarArr2, 0, i);
            this.e = atiyVarArr2;
            this.g = false;
            atiyVarArr = atiyVarArr2;
        }
        this.i = null;
        atiy atiyVar = atiyVarArr[i];
        if (atiyVar == null) {
            atiyVar = new atiy();
            atiyVarArr[i] = atiyVar;
        }
        this.f = i + 1;
        return atiyVar;
    }

    public final void d(atfy atfyVar, int i) {
        c().c(atfyVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(atgc atgcVar) {
        this.i = null;
        this.c = atgcVar;
    }

    public final long g(CharSequence charSequence) {
        boolean z;
        atiy[] atiyVarArr = this.e;
        int i = this.f;
        if (this.g) {
            atiyVarArr = (atiy[]) atiyVarArr.clone();
            this.e = atiyVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(atiyVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (atiyVarArr[i4].compareTo(atiyVarArr[i3]) > 0) {
                        atiy atiyVar = atiyVarArr[i3];
                        atiyVarArr[i3] = atiyVarArr[i4];
                        atiyVarArr[i4] = atiyVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            atgd a = atgf.e.a(this.a);
            atgd a2 = atgf.g.a(this.a);
            atgd q = atiyVarArr[0].a.q();
            if (a(q, a) >= 0 && a(q, a2) <= 0) {
                d(atfy.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = atiyVarArr[i5].b(j, true);
            } catch (atgg e) {
                if (charSequence != null) {
                    String bW = a.bW((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = bW;
                    } else {
                        e.a = a.co(str, bW, ": ");
                    }
                }
                throw e;
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            atiyVarArr[i6].a.v();
            atiy atiyVar2 = atiyVarArr[i6];
            if (i6 == i - 1) {
                z = true;
            } else {
                z = false;
            }
            j = atiyVar2.b(j, z);
        }
        if (this.d != null) {
            return j - r0.intValue();
        }
        atgc atgcVar = this.c;
        if (atgcVar != null) {
            int b = atgcVar.b(j);
            long j2 = j - b;
            if (b != this.c.a(j2)) {
                String str2 = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    str2 = a.cg(str2, (String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new atgh(str2);
            }
            return j2;
        }
        return j;
    }

    public final void h(Object obj) {
        if (obj instanceof atiz) {
            atiz atizVar = (atiz) obj;
            if (this == atizVar.e) {
                this.c = atizVar.a;
                this.d = atizVar.b;
                this.e = atizVar.c;
                int i = atizVar.d;
                if (i < this.f) {
                    this.g = true;
                }
                this.f = i;
                this.i = obj;
            }
        }
    }
}
