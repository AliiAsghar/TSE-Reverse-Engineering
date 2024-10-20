package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmc {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    private final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = eul.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean a() {
        if (this.a != -1 && this.b != -1) {
            return true;
        }
        return false;
    }

    public final void b(erk erkVar) {
        for (int i = 0; i < erkVar.a(); i++) {
            erj b = erkVar.b(i);
            if (b instanceof foj) {
                foj fojVar = (foj) b;
                if ("iTunSMPB".equals(fojVar.b) && c(fojVar.c)) {
                    return;
                }
            } else if (b instanceof foo) {
                foo fooVar = (foo) b;
                if ("com.apple.iTunes".equals(fooVar.a) && "iTunSMPB".equals(fooVar.b) && c(fooVar.c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
