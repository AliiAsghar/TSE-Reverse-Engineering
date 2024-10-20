package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum arbz {
    NO_ERROR(0, Status.n),
    PROTOCOL_ERROR(1, Status.m),
    INTERNAL_ERROR(2, Status.m),
    FLOW_CONTROL_ERROR(3, Status.m),
    SETTINGS_TIMEOUT(4, Status.m),
    STREAM_CLOSED(5, Status.m),
    FRAME_SIZE_ERROR(6, Status.m),
    REFUSED_STREAM(7, Status.n),
    CANCEL(8, Status.c),
    COMPRESSION_ERROR(9, Status.m),
    CONNECT_ERROR(10, Status.m),
    ENHANCE_YOUR_CALM(11, Status.j.withDescription("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, Status.h.withDescription("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, Status.d);

    public static final arbz[] o;
    public final Status p;
    private final int r;

    static {
        arbz[] values = values();
        arbz[] arbzVarArr = new arbz[((int) values[values.length - 1].a()) + 1];
        for (arbz arbzVar : values) {
            arbzVarArr[(int) arbzVar.a()] = arbzVar;
        }
        o = arbzVarArr;
    }

    arbz(int i, Status status) {
        this.r = i;
        String concat = "HTTP/2 error code: ".concat(String.valueOf(name()));
        if (status.getDescription() != null) {
            concat = concat + " (" + status.getDescription() + ")";
        }
        this.p = status.withDescription(concat);
    }

    public final long a() {
        return this.r;
    }
}
