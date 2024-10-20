package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahpj extends ahpf implements ahmw {
    public final Context a;
    public final aneo b;
    public final apwt c;
    public final ahmu d;
    public final ahpl e;
    public final ahiy f;
    private final ahkj g;
    private final boolean h;
    private final ahpe i;

    public ahpj(ahmv ahmvVar, Context context, ahpe ahpeVar, aneo aneoVar, apwt apwtVar, ahpl ahplVar, ahkj ahkjVar, armf armfVar, Executor executor, ahiy ahiyVar) {
        new AtomicReference(ahpa.a);
        new ConcurrentHashMap();
        this.i = ahpeVar;
        this.g = ahkjVar;
        this.f = ahiyVar;
        this.d = ahmvVar.a(executor, apwtVar, armfVar);
        this.a = context;
        this.b = aneoVar;
        this.c = apwtVar;
        this.e = ahplVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.h = bool.booleanValue();
    }

    public static final boolean c(int i) {
        if (i != 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ahpf
    public final void a() {
        ahpd ahpdVar = new ahpd() { // from class: ahph
            @Override // defpackage.ahpd
            public final void a(int i, String str) {
                ahpj.this.d(null, i, str, null);
            }
        };
        ahpe ahpeVar = this.i;
        ahpeVar.d = ahpdVar;
        if (ahpeVar.c.getAndSet(true)) {
            return;
        }
        albo.bN(new aarj(ahpeVar, 10), ahpeVar.b);
    }

    @Override // defpackage.ahmw
    public final void as() {
        if (this.h) {
            a();
        }
    }

    @Override // defpackage.ahpf
    public final void b(ahka ahkaVar, ashu ashuVar) {
        d(ahkaVar.a, 1, null, ashuVar);
    }

    public final void d(String str, int i, String str2, ashu ashuVar) {
        if (this.g.a) {
            albo.bG();
        } else {
            albo.bN(new ahpg(this, i, str, ashuVar, str2, 0), this.b);
        }
    }
}
