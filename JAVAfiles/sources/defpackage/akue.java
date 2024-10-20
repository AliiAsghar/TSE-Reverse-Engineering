package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akue extends AtomicInteger {
    public static final akua a;
    public final akue b;
    public final String c;
    public volatile akub<?> currentMetadata;
    public final long d;
    public final akrl e;
    public int f;
    public akue g;
    public boolean h;
    public volatile long i;
    int j;

    static {
        akua akudVar;
        try {
            akudVar = new akuc();
        } catch (Error | RuntimeException unused) {
            akudVar = new akud();
        }
        a = akudVar;
    }

    public akue(akue akueVar, String str, long j, akrl akrlVar) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = akueVar.f() ? akueVar.b : akueVar;
        this.c = str;
        this.f = -1;
        this.d = j;
        this.e = akrlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        akue akueVar = this.b;
        if (akueVar == null) {
            return -1;
        }
        return akueVar.f;
    }

    public final akrg b(boolean z, int i) {
        aozy createBuilder = akrg.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        String str = this.c;
        apag apagVar = createBuilder.b;
        akrg akrgVar = (akrg) apagVar;
        str.getClass();
        boolean z2 = true;
        akrgVar.b |= 1;
        akrgVar.c = str;
        int i2 = this.f;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        akrg akrgVar2 = (akrg) apagVar2;
        akrgVar2.b |= 2;
        akrgVar2.d = i2;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        apag apagVar3 = createBuilder.b;
        akrg akrgVar3 = (akrg) apagVar3;
        akrgVar3.b |= 4;
        akrgVar3.e = i;
        int i3 = this.j;
        if (!apagVar3.isMutable()) {
            createBuilder.u();
        }
        apag apagVar4 = createBuilder.b;
        akrg akrgVar4 = (akrg) apagVar4;
        int i4 = i3 - 1;
        if (i3 != 0) {
            akrgVar4.l = i4;
            akrgVar4.b |= 512;
            boolean z3 = this.h;
            if (!apagVar4.isMutable()) {
                createBuilder.u();
            }
            apag apagVar5 = createBuilder.b;
            akrg akrgVar5 = (akrg) apagVar5;
            akrgVar5.b |= 1024;
            akrgVar5.m = z3;
            long j = this.d;
            if (!apagVar5.isMutable()) {
                createBuilder.u();
            }
            akrg akrgVar6 = (akrg) createBuilder.b;
            akrgVar6.b |= 8;
            akrgVar6.f = j / 1000000;
            long j2 = this.i;
            if (j2 != 0) {
                albo.T(true);
                long j3 = (4611686018427387903L & j2) / 1000000;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                akrg akrgVar7 = (akrg) createBuilder.b;
                akrgVar7.b |= 32;
                akrgVar7.h = j3;
                albo.T(true);
                if ((j2 & 4611686018427387904L) == 0) {
                    z2 = false;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                akrg akrgVar8 = (akrg) createBuilder.b;
                akrgVar8.b |= 256;
                akrgVar8.k = z2;
            }
            if (z) {
                int i5 = get();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                akrg akrgVar9 = (akrg) createBuilder.b;
                akrgVar9.b |= 128;
                akrgVar9.j = i5;
            }
            return (akrg) createBuilder.s();
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final akrl c() {
        Object a2 = a.a(this);
        if (a2 == null) {
            return akrk.a;
        }
        akrj b = akrl.b();
        while (a2 != null) {
            akub akubVar = (akub) a2;
            b.a((aktp) akubVar.b, akubVar.a);
            a2 = akubVar.c;
        }
        return ((akrl) b).f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(int i, akue akueVar) {
        this.f = i;
        this.g = akueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        if (this.i != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        if (this.f < 0) {
            return true;
        }
        return false;
    }

    public akue(String str, akrl akrlVar, int i) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = null;
        this.c = str;
        this.f = 0;
        this.d = 0L;
        this.e = akrlVar;
        this.i = i != 2 ? Long.MIN_VALUE : 0L;
    }
}
