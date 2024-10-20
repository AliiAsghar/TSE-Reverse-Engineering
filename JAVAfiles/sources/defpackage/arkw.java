package defpackage;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arkw implements aquv {
    private static final ThreadLocal b = new ThreadLocal();
    public final apbt a;
    private final apca c;

    public arkw(apbt apbtVar) {
        apbtVar.getClass();
        this.a = apbtVar;
        this.c = apbtVar.getParserForType();
    }

    @Override // defpackage.aquv
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        return new arkv((apbt) obj, this.c);
    }

    @Override // defpackage.aquv
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        byte[] bArr;
        if (inputStream instanceof arkv) {
            arkv arkvVar = (arkv) inputStream;
            if (arkvVar.b == this.c) {
                try {
                    apbt apbtVar = arkvVar.a;
                    if (apbtVar == null) {
                        throw new IllegalStateException("message not available");
                    }
                    return apbtVar;
                } catch (IllegalStateException unused) {
                }
            }
        }
        try {
            aozg aozgVar = null;
            if (inputStream instanceof aqtl) {
                int available = inputStream.available();
                if (available > 0 && available <= 4194304) {
                    ThreadLocal threadLocal = b;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                        bArr = new byte[available];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i = available;
                    while (i > 0) {
                        int read = inputStream.read(bArr, available - i, i);
                        if (read == -1) {
                            break;
                        }
                        i -= read;
                    }
                    if (i == 0) {
                        aozgVar = aozg.O(bArr, available);
                    } else {
                        throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                    }
                } else if (available == 0) {
                    return this.a;
                }
            }
            if (aozgVar == null) {
                aozgVar = aozg.J(inputStream);
            }
            aozgVar.c = Integer.MAX_VALUE;
            try {
                Object f = this.c.f(aozgVar, arkx.a);
                try {
                    aozgVar.z(0);
                    return f;
                } catch (apba e) {
                    throw e;
                }
            } catch (apba e2) {
                throw new aqwb(Status.m.withDescription("Invalid protobuf byte sequence").d(e2));
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
