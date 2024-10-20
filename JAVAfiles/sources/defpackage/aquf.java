package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aquf extends RuntimeException {
    private static final long serialVersionUID = 1;

    public aquf() {
        super("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }
}
