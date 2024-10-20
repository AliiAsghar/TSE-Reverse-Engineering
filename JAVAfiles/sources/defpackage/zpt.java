package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.StateSet;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpt implements xzh {
    public Drawable a;
    public Drawable b;
    public Drawable c;
    public final Resources d;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private float[] k;
    private Drawable l;
    private Drawable m;
    private final Context n;
    private final armf o;
    private final armf p;
    private final armf q;
    private final armf r;

    public zpt(Context context, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        this.n = context;
        this.d = context.getResources();
        this.o = armfVar;
        this.p = armfVar2;
        this.q = armfVar3;
        this.r = armfVar4;
        r();
    }

    static int a(int i) {
        eap.j(i, r0);
        float f = r0[0] - 3.0f;
        float[] fArr = {f};
        if (f < brg.a) {
            return i;
        }
        return eap.c(fArr);
    }

    public static int b(Context context) {
        return context.getColor(R.color.primary_brand_non_icon_color);
    }

    public static int c(Context context, boolean z) {
        if (z) {
            return context.getColor(R.color.attachment_selected_m2);
        }
        return ahnz.f(context, R.attr.colorPrimaryBackground, "ConversationDrawables");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e(String str) {
        char c;
        switch (str.hashCode()) {
            case -1248341670:
                if (str.equals("application/ics")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1248334925:
                if (str.equals("application/pdf")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1248330447:
                if (str.equals("application/txt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1248329177:
                if (str.equals("application/vcs")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1073633483:
                if (str.equals("application/vnd.openxmlformats-officedocument.presentationml.presentation")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1071817359:
                if (str.equals("application/vnd.ms-powerpoint")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1050893613:
                if (str.equals("application/vnd.openxmlformats-officedocument.wordprocessingml.document")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -958424608:
                if (str.equals("text/calendar")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 262346941:
                if (str.equals("text/x-vcalendar")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 326991069:
                if (str.equals("text/x-vCalendar")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 904647503:
                if (str.equals("application/msword")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1639365779:
                if (str.equals("application/hbs-vcs")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1993842850:
                if (str.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return R.drawable.quantum_ic_drive_pdf_black_24;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return R.drawable.quantum_ic_event_black_24;
            case 7:
            case '\b':
                return R.drawable.quantum_ic_drive_document_black_24;
            case '\t':
            case '\n':
                return R.drawable.quantum_ic_drive_presentation_black_24;
            case 11:
                return R.drawable.quantum_ic_drive_spreadsheet_black_24;
            case '\f':
                return R.drawable.quantum_ic_drive_text_black_24;
            default:
                return R.drawable.quantum_ic_insert_drive_file_white_24;
        }
    }

    public static int f(Context context) {
        return context.getColor(R.color.file_attachment_primary_text_m2);
    }

    public static int g(Context context) {
        return context.getColor(R.color.file_attachment_secondary_text);
    }

    public static int h(Context context) {
        return ahnz.f(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables");
    }

    public static Drawable i(Context context) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        int dimension = (int) context.getResources().getDimension(R.dimen.file_icon_background_size);
        shapeDrawable.setIntrinsicHeight(dimension);
        shapeDrawable.setIntrinsicWidth(dimension);
        return yfo.i(context, shapeDrawable, ahnz.f(context, R.attr.colorPrimaryBrandIcon, "ConversationDrawables"));
    }

    public static GradientDrawable n(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke((int) context.getResources().getDimension(R.dimen.file_preview_background_border), ahnz.f(context, R.attr.colorOutlineVariant, "ConversationDrawables"));
        gradientDrawable.setCornerRadius((int) context.getResources().getDimension(R.dimen.file_attachment_rounded_corner_radius));
        return gradientDrawable;
    }

    public static GradientDrawable p(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    private final boolean u() {
        return ((wfh) this.p.b()).A();
    }

    private static int[] v(int i) {
        return new int[]{i};
    }

    public final int d() {
        return this.n.getColor(R.color.primary_brand_icon_color);
    }

    public final Drawable j(Context context, boolean z) {
        if (z) {
            if (this.m == null) {
                this.m = this.d.getDrawable(R.drawable.fastscroll_thumb_pressed);
            }
            return yfo.i(context, this.m, b(context));
        }
        int color = context.getColor(R.color.fastscroll_tint_color);
        if (this.l == null) {
            this.l = this.d.getDrawable(R.drawable.fastscroll_thumb);
        }
        Drawable drawable = this.l;
        drawable.getClass();
        return yfo.i(context, drawable, color);
    }

    public final Drawable k(Context context, int i, boolean z) {
        Drawable c;
        if (z) {
            uac uacVar = (uac) this.q.b();
            if (i == 40 && ttd.f()) {
                c = ((Context) uacVar.a).getDrawable(R.drawable.ic_e2ee_send_icon);
                c.getClass();
            } else if (!((Optional) uacVar.b).isEmpty()) {
                c = ((Context) uacVar.a).getDrawable(((lza) ((Optional) uacVar.b).get()).f());
                c.getClass();
            } else {
                throw new IllegalStateException("Cannot provide scheduled send button icon with missing ScheduledSendResources. Is the module missing?");
            }
        } else {
            c = ((uac) this.q.b()).c(i);
        }
        Drawable i2 = yfo.i(context, c, h(context));
        Drawable i3 = yfo.i(context, c, context.getColor(R.color.c2o_send_button_disabled_color_m2));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, i3);
        stateListDrawable.addState(StateSet.WILD_CARD, i2);
        return stateListDrawable;
    }

    @Override // defpackage.xzh
    public final void l(int i) {
        this.c = null;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = null;
    }

    public final Drawable m() {
        return p(d());
    }

    public final GradientDrawable o(int[] iArr, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        float[] s = s(z, z2, z3, z4, z5);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadii(s);
        if (iArr.length > 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            if (Build.VERSION.SDK_INT >= 29) {
                gradientDrawable.setColors(iArr, new float[]{0.2f, 0.8f});
            } else {
                gradientDrawable.setColors(iArr);
            }
        } else {
            gradientDrawable.setColor(iArr[0]);
        }
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zpq q(android.content.Context r6, defpackage.zps r7) {
        /*
            r5 = this;
            boolean r0 = r7.d
            r1 = 3
            java.lang.String r2 = "ConversationDrawables"
            if (r0 == 0) goto L1f
            boolean r0 = r7.a
            if (r0 == 0) goto Lf
            r0 = 2130969149(0x7f04023d, float:1.7546972E38)
            goto L1a
        Lf:
            int r0 = r7.e
            if (r0 != r1) goto L17
            r0 = 2130969152(0x7f040240, float:1.7546978E38)
            goto L1a
        L17:
            r0 = 2130969154(0x7f040242, float:1.7546982E38)
        L1a:
            int r0 = defpackage.ahnz.f(r6, r0, r2)
            goto L64
        L1f:
            armf r0 = r5.r
            java.lang.Object r0 = r0.b()
            trz r0 = (defpackage.trz) r0
            boolean r0 = r0.n()
            if (r0 == 0) goto L3d
            int r0 = r7.b
            boolean r0 = com.google.android.apps.messaging.shared.datamodel.data.MessageData.bY(r0)
            if (r0 == 0) goto L3d
            r0 = 2131102182(0x7f0609e6, float:1.7816795E38)
            int r0 = r6.getColor(r0)
            goto L64
        L3d:
            boolean r0 = r7.a
            if (r0 == 0) goto L51
            int r0 = r7.e
            if (r0 != r1) goto L49
            r0 = 2130969148(0x7f04023c, float:1.754697E38)
            goto L4c
        L49:
            r0 = 2130969150(0x7f04023e, float:1.7546974E38)
        L4c:
            int r0 = defpackage.ahnz.f(r6, r0, r2)
            goto L64
        L51:
            int r0 = r7.e
            if (r0 != r1) goto L5d
            r0 = 2130969151(0x7f04023f, float:1.7546976E38)
            int r0 = defpackage.ahnz.f(r6, r0, r2)
            goto L64
        L5d:
            r0 = 2130969153(0x7f040241, float:1.754698E38)
            int r0 = defpackage.ahnz.f(r6, r0, r2)
        L64:
            int r1 = r7.b
            r3 = 8
            r4 = 2130969124(0x7f040224, float:1.7546921E38)
            if (r1 == r3) goto L88
            r3 = 9
            if (r1 == r3) goto L88
            r3 = 13
            if (r1 == r3) goto L88
            r3 = 107(0x6b, float:1.5E-43)
            if (r1 == r3) goto L88
            r3 = 18
            if (r1 == r3) goto L88
            r3 = 19
            if (r1 == r3) goto L88
            switch(r1) {
                case 111: goto L88;
                case 112: goto L88;
                case 113: goto L88;
                case 114: goto L88;
                default: goto L84;
            }
        L84:
            r1 = 2130969183(0x7f04025f, float:1.754704E38)
            goto L89
        L88:
            r1 = r4
        L89:
            r3 = 1
            boolean r7 = r7.c
            if (r3 != r7) goto L8f
            goto L90
        L8f:
            r4 = r1
        L90:
            zpq r7 = new zpq
            int r6 = defpackage.ahnz.f(r6, r4, r2)
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpt.q(android.content.Context, zps):zpq");
    }

    public final void r() {
        Resources resources = this.d;
        float dimension = resources.getDimension(R.dimen.conversation_bubble_small_corner);
        float dimension2 = resources.getDimension(R.dimen.conversation_bubble_large_corner);
        this.e = new float[]{dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2};
        this.f = new float[]{dimension, dimension, dimension2, dimension2, dimension2, dimension2, dimension2, dimension2};
        this.h = new float[]{dimension, dimension, dimension2, dimension2, dimension2, dimension2, dimension, dimension};
        this.g = new float[]{dimension2, dimension2, dimension2, dimension2, dimension2, dimension2, dimension, dimension};
        this.i = new float[]{dimension2, dimension2, dimension, dimension, dimension2, dimension2, dimension2, dimension2};
        this.k = new float[]{dimension2, dimension2, dimension, dimension, dimension, dimension, dimension2, dimension2};
        this.j = new float[]{dimension2, dimension2, dimension2, dimension2, dimension, dimension, dimension2, dimension2};
    }

    public final float[] s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        float[] fArr = this.e;
        if (!z ? u() : !u()) {
            if (z3) {
                if (z2) {
                    fArr = this.h;
                } else {
                    z7 = true;
                    z2 = false;
                }
            } else {
                z7 = false;
            }
            if (z7) {
                fArr = this.g;
            } else if (z2) {
                fArr = this.f;
            }
        } else {
            if (z3) {
                if (z2) {
                    fArr = this.k;
                } else {
                    z6 = true;
                    z2 = false;
                }
            } else {
                z6 = false;
            }
            if (z6) {
                fArr = this.j;
            } else if (z2) {
                fArr = this.i;
            }
        }
        if (z4) {
            fArr = (float[]) fArr.clone();
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        if (z5) {
            float[] fArr2 = (float[]) fArr.clone();
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[2] = 0.0f;
            fArr2[3] = 0.0f;
            return fArr2;
        }
        return fArr;
    }

    public final int[] t(Context context, boolean z, boolean z2, int i) {
        boolean z3;
        int f;
        if (z) {
            if (z2) {
                f = ahnz.f(context, R.attr.colorMessageBubbleIncomingSelected, "ConversationDrawables");
            } else if (i == 3) {
                f = ahnz.f(context, R.attr.colorMessageBubbleOutgoingRcsSelected, "ConversationDrawables");
            } else {
                f = ahnz.f(context, R.attr.colorMessageBubbleOutgoingXmsSelected, "ConversationDrawables");
            }
            return v(f);
        }
        if (z2) {
            if (i == 3) {
                return v(ahnz.f(context, R.attr.colorSurfaceContainerHigh, "ConversationDrawables"));
            }
            return v(ahnz.f(context, R.attr.colorMessageBubbleIncomingXms, "ConversationDrawables"));
        }
        if (i == 3) {
            int f2 = ahnz.f(context, R.attr.colorMessageBubbleOutgoingRcsGradientStart, "ConversationDrawables");
            int f3 = ahnz.f(context, R.attr.colorMessageBubbleOutgoingRcsGradientEnd, "ConversationDrawables");
            if (f2 != f3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f2 = a(f2);
                f3 = a(f3);
            }
            if (z3) {
            }
            return new int[]{f2, f3};
        }
        return v(ahnz.f(context, R.attr.colorMessageBubbleOutgoingXms, "ConversationDrawables"));
    }
}
