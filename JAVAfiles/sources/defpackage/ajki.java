package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent$Parent_;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ajqq;
import defpackage.ajyp;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajki {
    public ajki() {
    }

    public static TemplateLayout A(Activity activity) {
        View findViewById;
        if (activity != null && (findViewById = activity.findViewById(R.id.suc_layout_status)) != null) {
            return (TemplateLayout) findViewById.getParent();
        }
        return null;
    }

    public static boolean B(View view) {
        Activity activity;
        boolean z;
        if (view instanceof ajue) {
            return ((ajue) view).e();
        }
        Context context = view.getContext();
        if (Build.VERSION.SDK_INT < 29 || !ajuu.h(context).m()) {
            return false;
        }
        try {
            int i = ajue.c;
            activity = ajuu.e(context);
            if (activity != null) {
                try {
                    TemplateLayout A = A(activity);
                    if (A instanceof ajue) {
                        return ((ajue) A).e();
                    }
                } catch (ClassCastException | IllegalArgumentException unused) {
                }
            }
        } catch (ClassCastException | IllegalArgumentException unused2) {
            activity = null;
        }
        if (activity != null) {
            z = ajgl.v(activity.getIntent());
        } else {
            z = false;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.sucUsePartnerResource});
        boolean z2 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public static ColorStateList C(Context context, ktk ktkVar, int i) {
        int n;
        ColorStateList f;
        if (ktkVar.v(i) && (n = ktkVar.n(i, 0)) != 0 && (f = egl.f(context, n)) != null) {
            return f;
        }
        return ktkVar.o(i);
    }

    private static String D(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) {
        int read = inputStream.read();
        do {
            if (read == 13) {
                read = inputStream.read();
            } else {
                if (read == 10) {
                    String str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                    byteArrayOutputStream.reset();
                    return str;
                }
                byteArrayOutputStream.write(read);
                read = inputStream.read();
            }
        } while (read > 0);
        throw new IOException("No data read from socket. EOF.");
    }

    private static void E(InputStream inputStream, Consumer consumer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String D = D(inputStream, byteArrayOutputStream);
        while (!albo.ah(D)) {
            Pair pair = null;
            if (!albo.ah(D)) {
                List c = anna.g(": ").c(D);
                if (c.size() == 2) {
                    pair = Pair.create((String) c.get(0), (String) c.get(1));
                }
            }
            if (!Objects.isNull(pair)) {
                consumer.accept(pair);
            }
            D = D(inputStream, byteArrayOutputStream);
        }
    }

    private static int[] F(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        return copyOf;
    }

    private static void G(CheckableImageButton checkableImageButton) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(hasOnClickListeners);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.c = hasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        int i = 1;
        if (true != hasOnClickListeners) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, dze.c(weight + i3, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static int c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    public static int d(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            return i;
        }
        return i2;
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList f;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (f = egl.f(context, resourceId)) != null) {
            return f;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable f;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (f = d.f(context, resourceId)) != null) {
            return f;
        }
        return typedArray.getDrawable(i);
    }

    public static boolean g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }

    public static Message.MessageContent i(final ChatMessage chatMessage) {
        chatMessage.getClass();
        return new AutoOneOf_Message_MessageContent$Parent_(chatMessage) { // from class: com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent$Impl_chat
            private final ChatMessage a;

            {
                this.a = chatMessage;
            }

            @Override // com.google.android.rcs.client.messaging.data.Message.MessageContent
            public final ajqq a() {
                return ajqq.CHAT;
            }

            @Override // com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent$Parent_, com.google.android.rcs.client.messaging.data.Message.MessageContent
            public final ChatMessage b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof Message.MessageContent) {
                    Message.MessageContent messageContent = (Message.MessageContent) obj;
                    if (ajqq.CHAT == messageContent.a() && this.a.equals(messageContent.b())) {
                        return true;
                    }
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "MessageContent{chat=" + this.a.toString() + "}";
            }
        };
    }

    public static ajpz j(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            asmg e = ajpz.e();
            E(byteArrayInputStream, new ajpx(e, 5));
            anjs c = ajqa.c();
            E(byteArrayInputStream, new ajpx(c, 6));
            int i = c.a;
            if (i > 0) {
                byte[] bArr2 = new byte[i];
                amcp.d(byteArrayInputStream, bArr2, i);
                c.g(aozb.w(bArr2));
            } else {
                c.g(aozb.A(byteArrayInputStream));
            }
            e.a = c.d();
            return e.u();
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "BASIC_TEXT_MESSAGE";
                        }
                        return "LOCATION_INFORMATION";
                    }
                    return "FILE_TRANSFER_INFORMATION";
                }
                return "MESSAGE_RECEIPT";
            }
            return "IS_COMPOSING";
        }
        return "CHAT";
    }

    public static ImageView.ScaleType l(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static void m(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(F(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void n(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(F(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void o(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        G(checkableImageButton);
    }

    public static void q(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        G(checkableImageButton);
    }

    public static void r(Intent intent, boolean z) {
        intent.putExtra("$tiktok$canRestartAccountSelector", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.util.concurrent.ListenableFuture s(java.util.List r4, defpackage.algy r5, java.util.concurrent.Executor r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r4.next()
            ancr r1 = (defpackage.ancr) r1
            com.google.common.util.concurrent.ListenableFuture r1 = r1.a()     // Catch: java.lang.Exception -> L4d
            boolean r2 = r1.isDone()     // Catch: java.lang.Exception -> L4d
            if (r2 == 0) goto L49
            java.lang.Object r2 = defpackage.albo.bQ(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            boolean r3 = r1.isCancelled()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r3 != 0) goto L33
            boolean r2 = r5.a(r2)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r2 == 0) goto Ld
        L33:
            boolean r4 = r0.isEmpty()     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            if (r4 == 0) goto L3a
            return r1
        L3a:
            r0.add(r1)     // Catch: java.util.concurrent.ExecutionException -> L3e java.lang.Exception -> L4d
            goto L5c
        L3e:
            boolean r4 = r0.isEmpty()     // Catch: java.lang.Exception -> L4d
            if (r4 == 0) goto L45
            return r1
        L45:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto L5c
        L49:
            r0.add(r1)     // Catch: java.lang.Exception -> L4d
            goto Ld
        L4d:
            r4 = move-exception
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.albo.bH(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L59
            return r4
        L59:
            r0.add(r4)
        L5c:
            ajyw r4 = new ajyw
            r4.<init>(r0, r5, r6)
            int r5 = r4.d
            r6 = -1
            if (r5 != r6) goto L68
            r5 = 1
            goto L69
        L68:
            r5 = 0
        L69:
            defpackage.albo.T(r5)
            com.google.common.util.concurrent.ListenableFuture r5 = r4.b()
            ajir r6 = new ajir
            r0 = 13
            r1 = 0
            r6.<init>(r4, r0, r1)
            java.util.concurrent.Executor r4 = r4.c
            r5.c(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajki.s(java.util.List, algy, java.util.concurrent.Executor):com.google.common.util.concurrent.ListenableFuture");
    }

    public static ListenableFuture u(ajye ajyeVar, ajwt ajwtVar) {
        return ajyeVar.b(ajwtVar);
    }

    public static ajxt v(Throwable th) {
        if (th instanceof ajxt) {
            return (ajxt) th;
        }
        return new ajxx(th);
    }

    @Deprecated
    public static void w(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, read);
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(android.widget.TextView r6, defpackage.ajwf r7) {
        /*
            ajus r0 = r7.a
            android.content.Context r1 = r6.getContext()
            if (r0 == 0) goto L23
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r2 = r7.a
            boolean r0 = r0.r(r2)
            if (r0 == 0) goto L23
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r2 = r7.a
            int r0 = r0.c(r1, r2)
            if (r0 == 0) goto L23
            r6.setTextColor(r0)
        L23:
            ajus r0 = r7.b
            if (r0 == 0) goto L61
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r2 = r7.b
            boolean r0 = r0.r(r2)
            if (r0 == 0) goto L61
            android.content.Context r0 = r6.getContext()
            int r2 = defpackage.ajue.c     // Catch: java.lang.Throwable -> L52
            android.app.Activity r0 = defpackage.ajuu.e(r0)     // Catch: java.lang.Throwable -> L52
            com.google.android.setupcompat.internal.TemplateLayout r2 = A(r0)     // Catch: java.lang.Throwable -> L52
            boolean r3 = r2 instanceof com.google.android.setupdesign.GlifLayout     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4c
            com.google.android.setupdesign.GlifLayout r2 = (com.google.android.setupdesign.GlifLayout) r2     // Catch: java.lang.Throwable -> L52
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> L52
            goto L50
        L4c:
            boolean r0 = defpackage.ajuu.t(r0)     // Catch: java.lang.Throwable -> L52
        L50:
            if (r0 != 0) goto L61
        L52:
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r2 = r7.b
            int r0 = r0.c(r1, r2)
            if (r0 == 0) goto L61
            r6.setLinkTextColor(r0)
        L61:
            ajus r0 = r7.c
            r2 = 0
            if (r0 == 0) goto L84
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r3 = r7.c
            boolean r0 = r0.r(r3)
            if (r0 == 0) goto L84
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r3 = r7.c
            r4 = 0
            float r0 = r0.b(r1, r3, r4)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L84
            r6.setTextSize(r2, r0)
        L84:
            ajus r0 = r7.d
            r3 = 0
            if (r0 == 0) goto La3
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r4 = r7.d
            boolean r0 = r0.r(r4)
            if (r0 == 0) goto La3
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r3 = r7.d
            java.lang.String r0 = r0.j(r1, r3)
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r0, r2)
        La3:
            boolean r0 = defpackage.ajuu.o(r1)
            if (r0 == 0) goto Lcf
            ajus r0 = r7.e
            if (r0 == 0) goto Lcf
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r4 = r7.e
            boolean r0 = r0.r(r4)
            if (r0 == 0) goto Lcf
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r4 = r7.e
            r5 = 400(0x190, float:5.6E-43)
            int r0 = r0.d(r1, r4, r5)
            if (r3 != 0) goto Lcb
            android.graphics.Typeface r3 = r6.getTypeface()
        Lcb:
            android.graphics.Typeface r3 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m(r3, r0, r2)
        Lcf:
            if (r3 == 0) goto Ld4
            r6.setTypeface(r3)
        Ld4:
            boolean r0 = r6 instanceof com.google.android.setupdesign.view.RichTextView
            if (r0 == 0) goto Lfd
            ajus r0 = r7.f
            if (r0 == 0) goto Lfd
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r3 = r7.f
            boolean r0 = r0.r(r3)
            if (r0 == 0) goto Lfd
            ajuu r0 = defpackage.ajuu.h(r1)
            ajus r3 = r7.f
            java.lang.String r0 = r0.j(r1, r3)
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)
            if (r0 == 0) goto Lfd
            r1 = r6
            com.google.android.setupdesign.view.RichTextView r1 = (com.google.android.setupdesign.view.RichTextView) r1
            com.google.android.setupdesign.view.RichTextView.a = r0
        Lfd:
            y(r6, r7)
            int r7 = r7.i
            r6.setGravity(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajki.x(android.widget.TextView, ajwf):void");
    }

    public static void y(TextView textView, ajwf ajwfVar) {
        int i;
        int i2;
        if (ajwfVar.g != null || ajwfVar.h != null) {
            Context context = textView.getContext();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (ajwfVar.g != null && ajuu.h(context).r(ajwfVar.g)) {
                    i = (int) ajuu.h(context).a(context, ajwfVar.g);
                } else {
                    i = layoutParams2.topMargin;
                }
                if (ajwfVar.h != null && ajuu.h(context).r(ajwfVar.h)) {
                    i2 = (int) ajuu.h(context).a(context, ajwfVar.h);
                } else {
                    i2 = layoutParams2.bottomMargin;
                }
                layoutParams2.setMargins(layoutParams2.leftMargin, i, layoutParams2.rightMargin, i2);
                textView.setLayoutParams(layoutParams);
            }
        }
    }

    public static int z(Context context) {
        char c;
        String j = ajuu.h(context).j(context, ajus.CONFIG_LAYOUT_GRAVITY);
        if (j == null) {
            return 0;
        }
        String lowerCase = j.toLowerCase(Locale.ROOT);
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode == 109757538 && lowerCase.equals(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME)) {
                c = 1;
            }
            c = 65535;
        } else {
            if (lowerCase.equals("center")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return 0;
            }
            return 8388611;
        }
        return 17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(da daVar) {
        try {
            daVar.ak(null);
            List<cg> l = daVar.l();
            l.getClass();
            if (!l.isEmpty()) {
                bd bdVar = new bd(daVar);
                for (cg cgVar : l) {
                    if (cgVar instanceof apxq) {
                        Object aS = ((apxq) cgVar).aS();
                        aS.getClass();
                        if (aS instanceof ajyp.a) {
                            bdVar.n(cgVar);
                        }
                    }
                    da G = cgVar.G();
                    G.getClass();
                    G.ag();
                    t(G);
                }
                if (!bdVar.h()) {
                    bdVar.y();
                    bdVar.b();
                }
            }
        } catch (IllegalStateException e) {
            StringWriter stringWriter = new StringWriter();
            daVar.G("fm_state", null, new PrintWriter(stringWriter), new String[0]);
            ((alvg) ((alvg) ajys.a.h()).g(e).h("com/google/apps/tiktok/account/api/controller/ActivityAccountStateViewModelBacked$Companion", "clearFragments", 327, "ActivityAccountStateViewModelBacked.kt")).t("popBackStackImmediate failure, fragment state %s", new aomj(aomi.NO_USER_DATA, stringWriter.toString()));
            throw e;
        }
    }

    public ajki(byte[] bArr) {
    }

    public void a(ajlb ajlbVar, float f, float f2) {
    }
}
