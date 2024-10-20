package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afpf extends arrp implements arqg {
    final /* synthetic */ afpg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afpf(afpg afpgVar) {
        super(0);
        this.a = afpgVar;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        agwl agwlVar = new agwl();
        agwlVar.m = 1;
        int i = agwlVar.l;
        agwlVar.e = 9;
        agwlVar.a = -1.0f;
        agwlVar.l = i | 419;
        agwlVar.d(0);
        agwlVar.a(0);
        agwlVar.b(0);
        agwlVar.l |= 3072;
        agwlVar.c(false);
        agwlVar.i = -1;
        int i2 = agwlVar.l;
        agwlVar.g = true;
        agwlVar.j = true;
        agwlVar.k = true;
        agwlVar.n = 1;
        agwlVar.o = 1;
        agwlVar.l = i2 | 123392;
        agwlVar.a(18);
        agwlVar.f = 1;
        agwlVar.l |= 64;
        afpg afpgVar = this.a;
        agwlVar.d(afpgVar.a.getResources().getDimensionPixelSize(R.dimen.emoji_tab_height));
        agwlVar.b(180);
        agwlVar.c(afpgVar.a());
        if (agwlVar.l == 131071 && agwlVar.m != 0 && agwlVar.n != 0 && agwlVar.o != 0) {
            return new agwm(agwlVar.a, agwlVar.b, agwlVar.c, agwlVar.d, agwlVar.e, agwlVar.f, agwlVar.g, agwlVar.h, agwlVar.i, agwlVar.j, agwlVar.k);
        }
        StringBuilder sb = new StringBuilder();
        if (agwlVar.m == 0) {
            sb.append(" headerLayoutOrientation");
        }
        if ((1 & agwlVar.l) == 0) {
            sb.append(" headerIconSelectedOverrideTint");
        }
        if ((agwlVar.l & 2) == 0) {
            sb.append(" rows");
        }
        if ((agwlVar.l & 4) == 0) {
            sb.append(" rowHeight");
        }
        if ((agwlVar.l & 8) == 0) {
            sb.append(" maxRecentCount");
        }
        if ((agwlVar.l & 16) == 0) {
            sb.append(" poolSize");
        }
        if ((agwlVar.l & 32) == 0) {
            sb.append(" columns");
        }
        if ((agwlVar.l & 64) == 0) {
            sb.append(" minRowsPerCategory");
        }
        if ((agwlVar.l & 128) == 0) {
            sb.append(" emojiIconBackground");
        }
        if ((agwlVar.l & 256) == 0) {
            sb.append(" hideCategoryTitle");
        }
        if ((agwlVar.l & 512) == 0) {
            sb.append(" displayEmojiVariants");
        }
        if ((agwlVar.l & 1024) == 0) {
            sb.append(" emojiPlaceHolderDrawable");
        }
        if ((agwlVar.l & 2048) == 0) {
            sb.append(" customEmojiTypeface");
        }
        if ((agwlVar.l & 4096) == 0) {
            sb.append(" popupWindowFocusable");
        }
        if ((agwlVar.l & 8192) == 0) {
            sb.append(" categoryIconMinWidth");
        }
        if ((agwlVar.l & 16384) == 0) {
            sb.append(" scrollToHeaderPositionOnCategoryChange");
        }
        if ((agwlVar.l & 32768) == 0) {
            sb.append(" enableHorizontalCategoryStartMargin");
        }
        if (agwlVar.n == 0) {
            sb.append(" highLightSelectedEmojiStatus");
        }
        if (agwlVar.o == 0) {
            sb.append(" scrollToInitialEmojiOption");
        }
        if ((agwlVar.l & 65536) == 0) {
            sb.append(" useTitleCaseCategoryNames");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
