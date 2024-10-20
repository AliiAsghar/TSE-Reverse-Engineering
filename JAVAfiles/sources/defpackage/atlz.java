package defpackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atlz implements Cloneable {
    private static final atmx[] c = new atmx[0];
    private static final atmu[] d = new atmu[0];
    public atlh a;
    public List[] b;
    private int e;

    public atlz(atlh atlhVar) {
        this.b = new List[4];
        this.a = atlhVar;
    }

    public final int a() {
        int d2 = this.a.d();
        atmn b = b();
        if (b != null) {
            return d2 + (b.f() << 4);
        }
        return d2;
    }

    public final atmn b() {
        for (atmx atmxVar : f(3)) {
            if (atmxVar instanceof atmn) {
                return (atmn) atmxVar;
            }
        }
        return null;
    }

    public final atmx c() {
        List list = this.b[0];
        if (list != null && list.size() != 0) {
            return (atmx) list.get(0);
        }
        return null;
    }

    public final Object clone() {
        atlz atlzVar = new atlz();
        int i = 0;
        while (true) {
            List[] listArr = this.b;
            int length = listArr.length;
            if (i < 4) {
                List list = listArr[i];
                if (list != null) {
                    atlzVar.b[i] = new LinkedList(list);
                }
                i++;
            } else {
                atlzVar.a = (atlh) this.a.clone();
                atlzVar.e = this.e;
                return atlzVar;
            }
        }
    }

    public final void d(atmx atmxVar, int i) {
        List[] listArr = this.b;
        if (listArr[i] == null) {
            listArr[i] = new LinkedList();
        }
        int[] iArr = this.a.b;
        int i2 = iArr[i];
        if (i2 != 65535) {
            iArr[i] = i2 + 1;
            this.b[i].add(atmxVar);
            return;
        }
        throw new IllegalStateException("DNS section count cannot be incremented");
    }

    public final atmu[] e(int i) {
        if (this.b[i] == null) {
            return d;
        }
        LinkedList linkedList = new LinkedList();
        atmx[] f = f(i);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < f.length; i2++) {
            atmk atmkVar = f[i2].f;
            if (hashSet.contains(atmkVar)) {
                int size = linkedList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    atmu atmuVar = (atmu) linkedList.get(size);
                    if (atmuVar.c() == f[i2].g() && atmuVar.d() == f[i2].h && atmuVar.g().equals(atmkVar)) {
                        atmuVar.i(f[i2]);
                        break;
                    }
                }
            }
            linkedList.add(new atmu(f[i2]));
            hashSet.add(atmkVar);
        }
        return (atmu[]) linkedList.toArray(new atmu[linkedList.size()]);
    }

    public final atmx[] f(int i) {
        List list = this.b[i];
        if (list == null) {
            return c;
        }
        return (atmx[]) list.toArray(new atmx[list.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        if (r2 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        r1.a(r2);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0110, code lost:
    
        if (r9 == r20.a.a) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        r1.e(r9, r6 + 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
    
        if (r12 == r20.a.a(3)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
    
        r1.e(r12, r6 + 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
    
        r20.e = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        return r1.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] g() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atlz.g():byte[]");
    }

    public final String toString() {
        String stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer();
        if (b() != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(this.a.e(a()));
            stringBuffer3.append("\n");
            stringBuffer2.append(stringBuffer3.toString());
        } else {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(this.a);
            stringBuffer4.append("\n");
            stringBuffer2.append(stringBuffer4.toString());
        }
        for (int i = 0; i < 4; i++) {
            if (this.a.c() != 5) {
                StringBuffer stringBuffer5 = new StringBuffer(";; ");
                atni.a.a(i);
                stringBuffer5.append(atni.b[i]);
                stringBuffer5.append(":\n");
                stringBuffer2.append(stringBuffer5.toString());
            } else {
                StringBuffer stringBuffer6 = new StringBuffer(";; ");
                atni.a.a(i);
                stringBuffer6.append(atni.c[i]);
                stringBuffer6.append(":\n");
                stringBuffer2.append(stringBuffer6.toString());
            }
            StringBuffer stringBuffer7 = new StringBuffer();
            if (i > 3) {
                stringBuffer = null;
            } else {
                StringBuffer stringBuffer8 = new StringBuffer();
                for (atmx atmxVar : f(i)) {
                    if (i == 0) {
                        StringBuffer stringBuffer9 = new StringBuffer(";;\t");
                        stringBuffer9.append(atmxVar.f);
                        stringBuffer8.append(stringBuffer9.toString());
                        StringBuffer stringBuffer10 = new StringBuffer(", type = ");
                        stringBuffer10.append(atnu.a(atmxVar.g));
                        stringBuffer8.append(stringBuffer10.toString());
                        StringBuffer stringBuffer11 = new StringBuffer(", class = ");
                        stringBuffer11.append(atkp.a(atmxVar.h));
                        stringBuffer8.append(stringBuffer11.toString());
                    } else {
                        stringBuffer8.append(atmxVar);
                    }
                    stringBuffer8.append("\n");
                }
                stringBuffer = stringBuffer8.toString();
            }
            stringBuffer7.append(stringBuffer);
            stringBuffer7.append("\n");
            stringBuffer2.append(stringBuffer7.toString());
        }
        StringBuffer stringBuffer12 = new StringBuffer(";; Message size: ");
        stringBuffer12.append(this.e);
        stringBuffer12.append(" bytes");
        stringBuffer2.append(stringBuffer12.toString());
        return stringBuffer2.toString();
    }

    public atlz() {
        this(new atlh());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public atlz(byte[] r14) {
        /*
            r13 = this;
            atkt r0 = new atkt
            r0.<init>(r14)
            atlh r14 = new atlh
            r14.<init>(r0)
            r13.<init>(r14)
            atlh r14 = r13.a
            int r14 = r14.c()
            atlh r1 = r13.a
            r2 = 6
            boolean r1 = r1.g(r2)
            r2 = 0
            r3 = r2
        L1c:
            r4 = 4
            if (r3 >= r4) goto Lbc
            atlh r4 = r13.a     // Catch: defpackage.atoc -> Lb7
            int r4 = r4.a(r3)     // Catch: defpackage.atoc -> Lb7
            if (r4 <= 0) goto L30
            java.util.List[] r5 = r13.b     // Catch: defpackage.atoc -> Lb7
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: defpackage.atoc -> Lb7
            r6.<init>(r4)     // Catch: defpackage.atoc -> Lb7
            r5[r3] = r6     // Catch: defpackage.atoc -> Lb7
        L30:
            r5 = r2
        L31:
            if (r5 >= r4) goto Lb3
            r0.a()     // Catch: defpackage.atoc -> Lb7
            int r6 = defpackage.atmx.j     // Catch: defpackage.atoc -> Lb7
            atmk r7 = new atmk     // Catch: defpackage.atoc -> Lb7
            r7.<init>(r0)     // Catch: defpackage.atoc -> Lb7
            int r8 = r0.b()     // Catch: defpackage.atoc -> Lb7
            int r9 = r0.b()     // Catch: defpackage.atoc -> Lb7
            if (r3 != 0) goto L4d
            atmx r6 = defpackage.atmx.l(r7, r8, r9)     // Catch: defpackage.atoc -> Lb7
            r12 = r3
            goto L8e
        L4d:
            long r10 = r0.e()     // Catch: defpackage.atoc -> Lb7
            int r6 = r0.b()     // Catch: defpackage.atoc -> Lb7
            if (r6 != 0) goto L67
            r12 = 5
            if (r14 != r12) goto L67
            r12 = 1
            if (r3 == r12) goto L61
            r12 = 2
            if (r3 != r12) goto L67
            goto L62
        L61:
            r12 = r3
        L62:
            atmx r6 = defpackage.atmx.m(r7, r8, r9, r10)     // Catch: defpackage.atoc -> Lb7
            goto L8e
        L67:
            r12 = 1
            atmx r7 = defpackage.atmx.k(r7, r8, r9, r10, r12)     // Catch: defpackage.atoc -> Lb7
            int r8 = r0.d()     // Catch: defpackage.atoc -> Lb7
            if (r8 < r6) goto Lab
            r0.g(r6)     // Catch: defpackage.atoc -> Lb7
            r7.c(r0)     // Catch: defpackage.atoc -> Lb7
            int r6 = r0.d()     // Catch: defpackage.atoc -> Lb7
            if (r6 > 0) goto La3
            java.lang.Object r6 = r0.c     // Catch: defpackage.atoc -> Lb7
            r8 = r6
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8     // Catch: defpackage.atoc -> Lb7
            int r8 = r8.capacity()     // Catch: defpackage.atoc -> Lb7
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch: defpackage.atoc -> Lb7
            r6.limit(r8)     // Catch: defpackage.atoc -> Lb7
            r12 = r3
            r6 = r7
        L8e:
            java.util.List[] r7 = r13.b     // Catch: defpackage.atoc -> Lb7
            r7 = r7[r12]     // Catch: defpackage.atoc -> Lb7
            r7.add(r6)     // Catch: defpackage.atoc -> Lb7
            r7 = 3
            if (r12 != r7) goto La0
            int r7 = r6.g     // Catch: defpackage.atoc -> Lb7
            r8 = 24
            if (r7 != r8) goto La0
            atnc r6 = (defpackage.atnc) r6     // Catch: defpackage.atoc -> Lb7
        La0:
            int r5 = r5 + 1
            goto L31
        La3:
            atoc r14 = new atoc     // Catch: defpackage.atoc -> Lb7
            java.lang.String r2 = "invalid record length"
            r14.<init>(r2)     // Catch: defpackage.atoc -> Lb7
            throw r14     // Catch: defpackage.atoc -> Lb7
        Lab:
            atoc r14 = new atoc     // Catch: defpackage.atoc -> Lb7
            java.lang.String r2 = "truncated record"
            r14.<init>(r2)     // Catch: defpackage.atoc -> Lb7
            throw r14     // Catch: defpackage.atoc -> Lb7
        Lb3:
            int r3 = r3 + 1
            goto L1c
        Lb7:
            r14 = move-exception
            if (r1 == 0) goto Lbb
            goto Lbc
        Lbb:
            throw r14
        Lbc:
            int r14 = r0.a()
            r13.e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atlz.<init>(byte[]):void");
    }
}
