package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apdf {
    DOUBLE(apdg.DOUBLE, 1),
    FLOAT(apdg.FLOAT, 5),
    INT64(apdg.LONG, 0),
    UINT64(apdg.LONG, 0),
    INT32(apdg.INT, 0),
    FIXED64(apdg.LONG, 1),
    FIXED32(apdg.INT, 5),
    BOOL(apdg.BOOLEAN, 0),
    STRING(apdg.STRING, 2),
    GROUP(apdg.MESSAGE, 3),
    MESSAGE(apdg.MESSAGE, 2),
    BYTES(apdg.BYTE_STRING, 2),
    UINT32(apdg.INT, 0),
    ENUM(apdg.ENUM, 0),
    SFIXED32(apdg.INT, 5),
    SFIXED64(apdg.LONG, 1),
    SINT32(apdg.INT, 0),
    SINT64(apdg.LONG, 0);

    public final apdg s;
    public final int t;

    apdf(apdg apdgVar, int i) {
        this.s = apdgVar;
        this.t = i;
    }
}
