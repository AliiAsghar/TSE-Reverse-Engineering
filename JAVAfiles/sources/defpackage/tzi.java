package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tzi {
    public static final tzi a;
    public static final tzi b;
    public static final tzi c;
    public static final tzi d;
    private static final /* synthetic */ tzi[] e;

    static {
        tzi tziVar = new tzi("NEW_TOMBSTONE_IS_SAME_AS_LAST_TOMBSTONE", 0);
        a = tziVar;
        tzi tziVar2 = new tzi("NO_MESSAGES_BEFORE_LAST_TOMBSTONE", 1);
        b = tziVar2;
        tzi tziVar3 = new tzi("LAST_MESSAGE_PROTOCOL_IS_SAME_AS_NEW_TOMBSTONE_PROTOCOL", 2);
        c = tziVar3;
        tzi tziVar4 = new tzi("LAST_MESSAGE_PROTOCOL_IS_DIFFERENT_FROM_NEW_TOMBSTONE_PROTOCOL", 3);
        d = tziVar4;
        tzi[] tziVarArr = {tziVar, tziVar2, tziVar3, tziVar4};
        e = tziVarArr;
        arhi.f(tziVarArr);
    }

    private tzi(String str, int i) {
    }

    public static tzi[] values() {
        return (tzi[]) e.clone();
    }
}
