package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqzi implements arho {
    @Override // defpackage.arho
    public final void d() {
        aren v;
        arhv arhvVar;
        if (!v().h && (arhvVar = (v = v()).b) != null && arhvVar.a() > 0) {
            v.b(false, true);
        }
    }

    @Override // defpackage.arho
    public final void f() {
        aqzh q = q();
        arej arejVar = q.m;
        arejVar.a = q;
        q.j = arejVar;
    }

    @Override // defpackage.arho
    public final void g(int i) {
        aqzh q = q();
        arax araxVar = q.j;
        int i2 = armc.a;
        q.e(new ajbz(q, i, 6, null));
    }

    @Override // defpackage.arho
    public final void h(aqsa aqsaVar) {
        aren v = v();
        aqsaVar.getClass();
        v.c = aqsaVar;
    }

    @Override // defpackage.arho
    public final void n(InputStream inputStream) {
        int a;
        try {
            if (!v().h) {
                aren v = v();
                if (!v.h) {
                    v.i++;
                    v.j++;
                    v.k = 0L;
                    arhn.f(v.g);
                    aqsa aqsaVar = v.c;
                    aqrz aqrzVar = aqry.a;
                    try {
                        try {
                            int available = inputStream.available();
                            if (available != 0 && aqsaVar != aqrzVar) {
                                arek arekVar = new arek(v);
                                OutputStream b = v.c.b(arekVar);
                                try {
                                    a = aren.a(inputStream, b);
                                    b.close();
                                    int i = v.a;
                                    if (i >= 0 && a > i) {
                                        throw new aqwb(Status.j.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(a), Integer.valueOf(v.a))));
                                    }
                                    v.c(arekVar, true);
                                } catch (Throwable th) {
                                    b.close();
                                    throw th;
                                }
                            } else if (available != -1) {
                                v.k = available;
                                int i2 = v.a;
                                if (i2 >= 0 && available > i2) {
                                    throw new aqwb(Status.j.withDescription(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(available), Integer.valueOf(v.a))));
                                }
                                v.e.clear();
                                v.e.put((byte) 0).putInt(available);
                                if (v.b == null) {
                                    v.b = v.f.a(v.e.position() + available);
                                }
                                v.d(v.e.array(), 0, v.e.position());
                                a = aren.a(inputStream, v.d);
                            } else {
                                arek arekVar2 = new arek(v);
                                a = aren.a(inputStream, arekVar2);
                                v.c(arekVar2, false);
                            }
                            if (available != -1 && a != available) {
                                throw new aqwb(Status.m.withDescription(String.format("Message length inaccurate %s != %s", Integer.valueOf(a), Integer.valueOf(available))));
                            }
                            arhn.f(v.g);
                            v.g.c(v.k);
                            arhn.f(v.g);
                        } catch (aqwb e) {
                            throw e;
                        } catch (IOException e2) {
                            throw new aqwb(Status.m.withDescription("Failed to frame message").d(e2));
                        }
                    } catch (RuntimeException e3) {
                        throw new aqwb(Status.m.withDescription("Failed to frame message").d(e3));
                    }
                } else {
                    throw new IllegalStateException("Framer already closed");
                }
            }
        } finally {
            arcb.h(inputStream);
        }
    }

    @Override // defpackage.arho
    public boolean o() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aqzh q();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract aren v();

    public final void w(int i) {
        aqzh q = q();
        synchronized (q.k) {
            q.n += i;
        }
    }
}
