package defpackage;

import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wqh {
    public static final wqh a;
    public static final wqh b;
    public static final wqh c;
    public static final wqh d;
    public static final wqh e;
    private static final /* synthetic */ wqh[] h;
    public final int f;
    public final int g;

    static {
        wqh wqhVar = new wqh("TOMBSTONE_SUCCESS_HELP_STILL_NEEDED", 0, 246, R.string.end_of_emergency_tombstone_success_text);
        a = wqhVar;
        wqh wqhVar2 = new wqh("TOMBSTONE_SUCCESS_HELP_NO_LONGER_NEEDED", 1, 247, R.string.end_of_emergency_tombstone_success_text);
        b = wqhVar2;
        wqh wqhVar3 = new wqh("TOMBSTONE_FAILURE_HELP_STILL_NEEDED", 2, 248, R.string.end_of_emergency_tombstone_failure_text);
        c = wqhVar3;
        wqh wqhVar4 = new wqh("TOMBSTONE_FAILURE_HELP_NO_LONGER_NEEDED", 3, 249, R.string.end_of_emergency_tombstone_failure_text);
        d = wqhVar4;
        wqh wqhVar5 = new wqh("TOMBSTONE_UNEXPECTED_END", 4, 250, R.string.end_of_emergency_tombstone_unexpected_text);
        e = wqhVar5;
        wqh[] wqhVarArr = {wqhVar, wqhVar2, wqhVar3, wqhVar4, wqhVar5};
        h = wqhVarArr;
        arhi.f(wqhVarArr);
    }

    private wqh(String str, int i, int i2, int i3) {
        this.f = i2;
        this.g = i3;
    }

    public static wqh[] values() {
        return (wqh[]) h.clone();
    }
}
