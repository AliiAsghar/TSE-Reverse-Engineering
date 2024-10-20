package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bd extends dk implements cx {
    final da a;
    boolean b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd(da daVar) {
        super(null);
        daVar.i();
        cn cnVar = daVar.n;
        if (cnVar != null) {
            cnVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = daVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.j) {
            if (da.Y(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                dj djVar = (dj) this.d.get(i2);
                cg cgVar = djVar.b;
                if (cgVar != null) {
                    cgVar.A += i;
                    if (da.Y(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + djVar.b + " to " + djVar.b.A);
                    }
                }
            }
        }
    }

    @Override // defpackage.dk
    public final void b() {
        u();
        this.a.J(this, false);
    }

    @Override // defpackage.dk
    public final void c() {
        u();
        this.a.J(this, true);
    }

    @Override // defpackage.dk
    public final void d(int i, cg cgVar, String str, int i2) {
        String str2 = cgVar.X;
        if (str2 != null) {
            emb.a(cgVar, str2);
        }
        Class<?> cls = cgVar.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = cgVar.H;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + cgVar + ": was " + cgVar.H + " now " + str);
                }
                cgVar.H = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = cgVar.F;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + cgVar + ": was " + cgVar.F + " now " + i);
                    }
                    cgVar.F = i;
                    cgVar.G = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + cgVar + " with tag " + str + " to container view with no id");
                }
            }
            p(new dj(i2, cgVar));
            cgVar.B = this.a;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void e(String str, PrintWriter printWriter) {
        f(str, printWriter, true);
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (!this.d.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                dj djVar = (dj) this.d.get(i);
                switch (djVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + djVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(djVar.b);
                if (z) {
                    if (djVar.d != 0 || djVar.e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.e));
                    }
                    if (djVar.f != 0 || djVar.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(djVar.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(djVar.g));
                    }
                }
            }
        }
    }

    @Override // defpackage.cx
    public final boolean g(ArrayList arrayList, ArrayList arrayList2) {
        if (da.Y(2)) {
            toString();
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (this.j) {
            this.a.c.add(this);
            return true;
        }
        return true;
    }

    @Override // defpackage.dk
    public final boolean h() {
        return this.d.isEmpty();
    }

    @Override // defpackage.dk
    public final void i() {
        m(false, true);
    }

    @Override // defpackage.dk
    public final void j() {
        m(true, true);
    }

    @Override // defpackage.dk
    public final void k(cg cgVar) {
        da daVar = cgVar.B;
        if (daVar != null && daVar != this.a) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + cgVar.toString() + " is already attached to a FragmentManager.");
        }
        p(new dj(4, cgVar));
    }

    @Override // defpackage.dk
    public final void l(cg cgVar) {
        da daVar = cgVar.B;
        if (daVar != null && daVar != this.a) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + cgVar.toString() + " is already attached to a FragmentManager.");
        }
        p(new dj(5, cgVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(boolean z, boolean z2) {
        if (!this.b) {
            if (da.Y(2)) {
                toString();
                Log.v("FragmentManager", "Commit: ".concat(toString()));
                PrintWriter printWriter = new PrintWriter(new dp());
                e("  ", printWriter);
                printWriter.close();
            }
            this.b = true;
            if (this.j) {
                this.c = this.a.i.getAndIncrement();
            } else {
                this.c = -1;
            }
            if (z2) {
                this.a.I(this, z);
                return;
            }
            return;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // defpackage.dk
    public final void n(cg cgVar) {
        da daVar = cgVar.B;
        if (daVar != null && daVar != this.a) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + cgVar.toString() + " is already attached to a FragmentManager.");
        }
        p(new dj(3, cgVar));
    }

    @Override // defpackage.dk
    public final void o(cg cgVar, eng engVar) {
        if (cgVar.B == this.a) {
            if (engVar == eng.INITIALIZED && cgVar.g >= 0) {
                throw new IllegalArgumentException(a.cc(engVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
            }
            if (engVar != eng.DESTROYED) {
                p(new dj(cgVar, engVar));
                return;
            }
            throw new IllegalArgumentException(a.cc(engVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        da daVar = this.a;
        Objects.toString(daVar);
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(daVar.toString()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
