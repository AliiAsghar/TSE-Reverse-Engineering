package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akwe {
    public static final /* synthetic */ int c = 0;
    public final boolean a;
    public final Pattern b;

    static {
        Pattern.compile("\\\\");
        Pattern.compile("(?:^|[^$])(?:\\$\\$)*\\$[`']");
        Pattern.compile("\\$\\$");
    }

    public akwe(Pattern pattern, boolean z) {
        this.b = pattern;
        this.a = z;
    }
}
