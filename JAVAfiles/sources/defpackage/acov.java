package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acov {
    public static final anna a = anna.e(';');

    public static String a(String str) {
        String[] split = str.split("=");
        if (split != null && split.length >= 2) {
            return split[1].trim();
        }
        throw new IllegalStateException(String.format("%s does not follow reason format.", str));
    }
}
