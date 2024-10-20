package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class aqyf {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final aqxh d;
    public final int e;
    public final arhn f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public aqyf(aqxh aqxhVar, int i, arhn arhnVar) {
        this.d = aqxhVar;
        this.e = i;
        this.f = arhnVar;
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        boolean z = false;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (i2 == 3) {
                        z = true;
                    }
                    albo.T(z);
                }
            } else {
                if (i2 == 2) {
                    z = true;
                }
                albo.T(z);
            }
        } else {
            if (i2 == 1) {
                z = true;
            }
            albo.T(z);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel);

    protected abstract int b(Parcel parcel);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(InputStream inputStream) {
        e();
        Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.b == null) {
                this.b = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        this.g = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        int a;
        int i;
        while (true) {
            int i2 = this.k;
            int i3 = i2 - 1;
            InputStream inputStream = null;
            if (i2 != 0) {
                boolean z = true;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2 || !this.g) {
                            return;
                        }
                    } else if (!i() && !this.g) {
                        return;
                    }
                } else if (!this.a) {
                    return;
                }
                if (h()) {
                    try {
                        try {
                            aqyg c = aqyg.c();
                            try {
                                int i4 = 0;
                                c.a().writeInt(0);
                                Parcel a2 = c.a();
                                int i5 = this.h;
                                this.h = i5 + 1;
                                a2.writeInt(i5);
                                int i6 = this.k;
                                int i7 = i6 - 1;
                                if (i6 != 0) {
                                    if (i7 != 0) {
                                        if (i7 != 1) {
                                            if (i7 != 2) {
                                                throw new AssertionError();
                                            }
                                            a = i4 | 4 | b(c.a());
                                            c(4);
                                            aqas.k(c.a(), a);
                                            int dataSize = c.a().dataSize();
                                            this.d.t(this.e, c);
                                            this.f.c(dataSize);
                                            arhn.f(this.f);
                                            c.close();
                                        } else {
                                            a = 0;
                                        }
                                    } else {
                                        a = a(c.a()) | 1;
                                        c(2);
                                        if (!i() && !this.g) {
                                            aqas.k(c.a(), a);
                                            int dataSize2 = c.a().dataSize();
                                            this.d.t(this.e, c);
                                            this.f.c(dataSize2);
                                            arhn.f(this.f);
                                            c.close();
                                        }
                                    }
                                    if (this.i == 0) {
                                        inputStream = this.b;
                                    } else {
                                        Queue queue = this.c;
                                        if (queue != null) {
                                            inputStream = (InputStream) queue.peek();
                                        }
                                    }
                                    if (inputStream != null) {
                                        int i8 = a | 2;
                                        Parcel a3 = c.a();
                                        if (inputStream instanceof aqyh) {
                                            this.j = ((aqyh) inputStream).a(a3);
                                            i = 64;
                                            z = false;
                                        } else {
                                            byte[] b = aqxm.b();
                                            try {
                                                int read = inputStream.read(b);
                                                if (read <= 0) {
                                                    a3.writeInt(0);
                                                } else {
                                                    a3.writeInt(read);
                                                    a3.writeByteArray(b, 0, read);
                                                    this.j += read;
                                                    if (read == b.length) {
                                                        i = 128;
                                                    }
                                                }
                                                z = false;
                                                i = 0;
                                            } finally {
                                                aqxm.a(b);
                                            }
                                        }
                                        if (!z) {
                                            inputStream.close();
                                            int i9 = this.i;
                                            this.i = i9 + 1;
                                            if (i9 > 0) {
                                                Queue queue2 = this.c;
                                                queue2.getClass();
                                                queue2.poll();
                                            }
                                            arhn.f(this.f);
                                            arhn.f(this.f);
                                            this.j = 0;
                                        }
                                        i4 = i8 | i;
                                    } else {
                                        albo.T(this.g);
                                        i4 = a;
                                    }
                                    if (this.g && !i()) {
                                        c(3);
                                        a = i4 | 4 | b(c.a());
                                        c(4);
                                        aqas.k(c.a(), a);
                                        int dataSize22 = c.a().dataSize();
                                        this.d.t(this.e, c);
                                        this.f.c(dataSize22);
                                        arhn.f(this.f);
                                        c.close();
                                    } else {
                                        a = i4;
                                        aqas.k(c.a(), a);
                                        int dataSize222 = c.a().dataSize();
                                        this.d.t(this.e, c);
                                        this.f.c(dataSize222);
                                        arhn.f(this.f);
                                        c.close();
                                    }
                                } else {
                                    throw null;
                                }
                            } catch (Throwable th) {
                                try {
                                    c.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (StatusException e) {
                            c(5);
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw Status.m.d(e2).asException();
                    }
                } else {
                    return;
                }
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.d.w();
    }

    protected final boolean i() {
        Queue queue = this.c;
        if (queue != null) {
            if (!queue.isEmpty()) {
                return true;
            }
            return false;
        }
        if (this.b != null && this.i == 0) {
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        String simpleName;
        String str;
        simpleName = getClass().getSimpleName();
        int i = this.k;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "CLOSED";
                        }
                    } else {
                        str = "SUFFIX_SENT";
                    }
                } else {
                    str = "ALL_MESSAGES_SENT";
                }
            } else {
                str = "PREFIX_SENT";
            }
        } else {
            str = "INITIAL";
        }
        return simpleName + "[S=" + str + "/NDM=" + this.i + "]";
    }
}
