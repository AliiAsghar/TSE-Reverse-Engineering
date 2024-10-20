package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
class yph implements algk {
    @Override // defpackage.algk
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final amzq apply(Status.Code code) {
        Status.Code code2 = Status.Code.OK;
        switch (code.ordinal()) {
            case 1:
                return amzq.RPC_CANCELLED;
            case 2:
                return amzq.RPC_UNKNOWN;
            case 3:
                return amzq.RPC_INVALID_ARGUMENT;
            case 4:
                return amzq.RPC_DEADLINE_EXCEEDED;
            case 5:
                return amzq.RPC_NOT_FOUND;
            case 6:
                return amzq.RPC_ALREADY_EXISTS;
            case 7:
                return amzq.RPC_PERMISSION_DENIED;
            case 8:
                return amzq.RPC_RESOURCE_EXHAUSTED;
            case 9:
                return amzq.RPC_FAILED_PRECONDITION;
            case 10:
                return amzq.RPC_ABORTED;
            case 11:
                return amzq.RPC_OUT_OF_RANGE;
            case 12:
                return amzq.RPC_UNIMPLEMENTED;
            case 13:
                return amzq.RPC_INTERNAL;
            case 14:
                return amzq.RPC_UNAVAILABLE;
            case 15:
                return amzq.RPC_DATA_LOSS;
            case 16:
                return amzq.RPC_UNAUTHENTICATED;
            default:
                return b(code);
        }
    }

    public amzq b(Status.Code code) {
        throw null;
    }
}
