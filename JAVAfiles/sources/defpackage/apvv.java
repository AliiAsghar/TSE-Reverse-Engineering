package defpackage;

import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apvv {
    public static final apvv a;
    public static final apvv b;
    public static final apvv c;
    public static final apvv d;
    public static final apvv e;
    public static final apvv f;
    private static final /* synthetic */ apvv[] h;
    public final String g;

    static {
        apvv apvvVar = new apvv("Stroke", 0, "st");
        a = apvvVar;
        apvv apvvVar2 = new apvv("Fill", 1, "fl");
        b = apvvVar2;
        apvv apvvVar3 = new apvv("Solid", 2, "1");
        c = apvvVar3;
        apvv apvvVar4 = new apvv("Shape", 3, "sh");
        d = apvvVar4;
        apvv apvvVar5 = new apvv("Group", 4, "gr");
        e = apvvVar5;
        apvv apvvVar6 = new apvv("Transform", 5, "tr");
        f = apvvVar6;
        apvv[] apvvVarArr = {apvvVar, apvvVar2, apvvVar3, apvvVar4, apvvVar5, apvvVar6};
        h = apvvVarArr;
        arhi.f(apvvVarArr);
        apvv[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(values.length), 16));
        for (apvv apvvVar7 : values) {
            linkedHashMap.put(apvvVar7.g, apvvVar7);
        }
    }

    private apvv(String str, int i, String str2) {
        this.g = str2;
    }

    public static apvv[] values() {
        return (apvv[]) h.clone();
    }
}
