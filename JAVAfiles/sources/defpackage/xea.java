package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xea implements algk {
    private final /* synthetic */ int a;

    public xea(int i) {
        this.a = i;
    }

    public static final aptw a(anit anitVar) {
        anitVar.getClass();
        aozy createBuilder = aptw.a.createBuilder();
        Object apply = aniu.a.apply(anitVar.b);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aptw) createBuilder.b).b = ((aptu) apply).a();
        Object apply2 = aniu.b.apply(anitVar.c);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aptw) createBuilder.b).c = ((aptr) apply2).a();
        aptw aptwVar = (aptw) createBuilder.s();
        aptwVar.getClass();
        return aptwVar;
    }

    @Override // defpackage.algk
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return new apyg(obj);
                            }
                            throw null;
                        }
                        anir anirVar = (anir) obj;
                        switch (anirVar.ordinal()) {
                            case 0:
                                return aptu.TACHYGRAM_ERROR_CANCELLED;
                            case 1:
                                return aptu.TACHYGRAM_ERROR_UNKNOWN;
                            case 2:
                                return aptu.TACHYGRAM_ERROR_INVALID_ARGUMENT;
                            case 3:
                                return aptu.TACHYGRAM_ERROR_DEADLINE_EXCEEDED;
                            case 4:
                                return aptu.TACHYGRAM_ERROR_NOT_FOUND;
                            case 5:
                                return aptu.TACHYGRAM_ERROR_ALREADY_EXISTS;
                            case 6:
                                return aptu.TACHYGRAM_ERROR_PERMISSION_DENIED;
                            case 7:
                                return aptu.TACHYGRAM_ERROR_RESOURCE_EXHAUSTED;
                            case 8:
                                return aptu.TACHYGRAM_ERROR_FAILED_PRECONDITION;
                            case 9:
                                return aptu.TACHYGRAM_ERROR_ABORTED;
                            case 10:
                                return aptu.TACHYGRAM_ERROR_OUT_OF_RANGE;
                            case 11:
                                return aptu.TACHYGRAM_ERROR_UNIMPLEMENTED;
                            case 12:
                                return aptu.TACHYGRAM_ERROR_INTERNAL;
                            case 13:
                                return aptu.TACHYGRAM_ERROR_UNAVAILABLE;
                            case 14:
                                return aptu.TACHYGRAM_ERROR_DATA_LOSS;
                            case 15:
                                return aptu.TACHYGRAM_ERROR_UNAUTHENTICATED;
                            case 16:
                                return aptu.TACHYGRAM_ERROR_TACHYGRAM_INTERNAL;
                            default:
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(anirVar))));
                        }
                    }
                    anis anisVar = (anis) obj;
                    switch (anisVar.ordinal()) {
                        case 0:
                            return aptr.ERROR_NO_RETRY;
                        case 1:
                            return aptr.ERROR_RETRY_IMMEDIATE;
                        case 2:
                            return aptr.ERROR_RETRY_REFRESH_REGISTRATION;
                        case 3:
                            return aptr.ERROR_RETRY_NEEDS_REPROVISION;
                        case 4:
                            return aptr.ERROR_RETRY_NEEDS_GROUP_RECREATION;
                        case 5:
                            return aptr.ERROR_REMOVE_SELF_FROM_GROUP;
                        case 6:
                            return aptr.ERROR_DESTINATION_NOT_TACHYGRAM;
                        default:
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(anisVar))));
                    }
                }
                return Integer.valueOf(((zlo) obj).e);
            }
            anir anirVar2 = (anir) obj;
            switch (anirVar2.ordinal()) {
                case 0:
                case 2:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 16:
                    return qee.TRANSPORT_INTERNAL_ERROR;
                case 1:
                    return qee.UNKNOWN_CAUSE;
                case 3:
                case 13:
                    return qee.NETWORK_CONNECTION_ERROR;
                case 6:
                    return qee.NETWORK_PERMISSION_DENIED;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(anirVar2))));
            }
        }
        anis anisVar2 = (anis) obj;
        switch (anisVar2.ordinal()) {
            case 0:
            case 1:
            case 5:
                return qfu.RECOVERY_STRATEGY_NONE;
            case 2:
                return qfu.RECOVERY_STRATEGY_REFRESH_REGISTRATION;
            case 3:
                return qfu.RECOVERY_STRATEGY_REPROVISION;
            case 4:
                return qfu.RECOVERY_STRATEGY_RECREATE_GROUP;
            case 6:
                return qfu.RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(anisVar2))));
        }
    }
}
