package defpackage;

import defpackage.atf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asm {
    public final arqr a;
    public final ath b;
    public atf c;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    final class a implements atd {
        public final List a = new ArrayList();

        public a() {
        }

        @Override // defpackage.atd
        public final void a(int i) {
            long j = asn.a;
            asm asmVar = asm.this;
            atf atfVar = asmVar.c;
            if (atfVar == null) {
                return;
            }
            this.a.add(new atf.a(i, j, asmVar.b));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b();
    }

    public asm() {
        this((byte[]) null);
    }

    public final b a(int i, long j) {
        atf atfVar = this.c;
        if (atfVar != null) {
            atf.a aVar = new atf.a(i, j, this.b);
            atfVar.c.a(aVar);
            return aVar;
        }
        return aqz.a;
    }

    public asm(arqr arqrVar) {
        this.a = arqrVar;
        this.b = new ath();
    }

    public /* synthetic */ asm(byte[] bArr) {
        this((arqr) null);
    }
}
