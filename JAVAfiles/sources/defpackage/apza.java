package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apza extends apyu {
    private final alog b;

    public apza(alog alogVar) {
        this.b = alogVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void b(Throwable th) {
        alog a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            apyu apyuVar = (apyu) a.get(i);
            try {
                apyuVar.b(th);
            } catch (RuntimeException e) {
                apzg.c(e, apyuVar, "failed", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void c() {
        alog a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            apyu apyuVar = (apyu) a.get(i);
            try {
                apyuVar.c();
            } catch (RuntimeException e) {
                apzg.e(e, apyuVar, "methodFinished");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void d() {
        int i = 0;
        while (true) {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                apyu apyuVar = (apyu) alogVar.get(i);
                try {
                    apyuVar.d();
                } catch (RuntimeException e) {
                    apzg.e(e, apyuVar, "methodStarting");
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void e() {
        int i = 0;
        while (true) {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                apyu apyuVar = (apyu) alogVar.get(i);
                try {
                    apyuVar.e();
                } catch (RuntimeException e) {
                    apzg.e(e, apyuVar, "ready");
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void f() {
        int i = 0;
        while (true) {
            alog alogVar = this.b;
            if (i < ((alsx) alogVar).c) {
                apyu apyuVar = (apyu) alogVar.get(i);
                try {
                    apyuVar.f();
                } catch (RuntimeException e) {
                    apzg.e(e, apyuVar, "requested");
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.apyu
    public final void g(Object obj) {
        alog a = this.b.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            apyu apyuVar = (apyu) a.get(i);
            try {
                apyuVar.g(obj);
            } catch (RuntimeException e) {
                apzg.c(e, apyuVar, "succeeded", obj);
            }
        }
    }
}
