package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agxg implements agyc {
    public alog e;
    public final Set f;
    public long g;
    public agxe h;
    public final ahar i;
    public boolean j;
    public final dyl l;
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager");
    public static final anna k = anna.e(',');
    public static final agyb b = agyd.b("emoji_compat_version_representatives", "🙂\u200d↔️,🫨,🫠,😮\u200d💨,🥲,🧑\u200d🦽,🥱,🥰,🤪,♀️,🤣");
    public static final agyb c = agyd.b("emoji_compat_app_whitelist", "");
    public static final agxg instance = new agxg();
    public static boolean d = false;

    public agxg() {
        int i = alog.d;
        this.e = alsx.a;
        this.l = new agxd(this);
        this.f = new HashSet();
        this.h = agxe.a;
        this.i = ahar.b();
    }

    public static boolean b(agxe agxeVar) {
        agxl.a();
        return agxl.c("🥱", agxeVar);
    }

    public final ejx a() {
        try {
            ejx b2 = ejx.b();
            if (b2.a() == 1) {
                return b2;
            }
            if (b2.a() == 2) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 335, "EmojiCompatManager.java")).q("EmojiCompat failed to load.");
            } else {
                ((alvg) ((alvg) a.g()).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", 337, "EmojiCompatManager.java")).q("EmojiCompat is not loaded.");
            }
            return null;
        } catch (IllegalStateException e) {
            ((alvg) ((alvg) ((alvg) a.g()).g(e)).h("com/google/android/libraries/inputmethod/emoji/renderer/EmojiCompatManager", "getEmojiCompatIfLoaded", (char) 342, "EmojiCompatManager.java")).q("EmojiCompat.init() was never called.");
            return null;
        }
    }
}
