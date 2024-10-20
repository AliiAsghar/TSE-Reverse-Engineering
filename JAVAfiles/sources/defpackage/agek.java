package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agek {
    public static final agek a;
    public static final agek b;
    public static final agek c;
    public static final agek d;
    public static final agek e;
    public static final agek f;
    public static final agek g;
    public static final agek h;
    public static final agek i;
    public static final /* synthetic */ arpx k;
    private static final /* synthetic */ agek[] l;
    public final int j;

    static {
        agek agekVar = new agek("CAMERA_GALLERY", 0, R.string.camera_gallery_screen_title);
        a = agekVar;
        agek agekVar2 = new agek("EMOJI", 1, R.string.emoji_screen_title);
        b = agekVar2;
        agek agekVar3 = new agek("GIFS", 2, R.string.gif_screen_title);
        c = agekVar3;
        agek agekVar4 = new agek("PROXY", 3, R.string.proxy_screen_title);
        d = agekVar4;
        agek agekVar5 = new agek("SHORTCUTS", 4, R.string.shortcuts_screen_title);
        e = agekVar5;
        agek agekVar6 = new agek("STICKERS", 5, R.string.sticker_screen_title);
        f = agekVar6;
        agek agekVar7 = new agek(VCardConstants.PARAM_TYPE_VOICE, 6, R.string.voice_screen_title);
        g = agekVar7;
        agek agekVar8 = new agek("MAGIC_COMPOSE", 7, R.string.placeholder);
        h = agekVar8;
        agek agekVar9 = new agek("EMOTIFY", 8, R.string.penpal_screen_title);
        i = agekVar9;
        agek[] agekVarArr = {agekVar, agekVar2, agekVar3, agekVar4, agekVar5, agekVar6, agekVar7, agekVar8, agekVar9};
        l = agekVarArr;
        k = arhi.f(agekVarArr);
    }

    private agek(String str, int i2, int i3) {
        this.j = i3;
    }

    public static agek a(String str) {
        return (agek) Enum.valueOf(agek.class, str);
    }

    public static agek[] values() {
        return (agek[]) l.clone();
    }
}
