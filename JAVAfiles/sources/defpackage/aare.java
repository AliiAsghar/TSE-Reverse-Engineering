package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aare extends aaqm implements aabc {
    private final aarc c;
    private final aaqa d;
    private aara e;
    private final aarb f;
    private final aabd g;
    private final zxy k;

    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [armf, java.lang.Object] */
    public aare(Context context, yti ytiVar, zme zmeVar, aaak aaakVar, aabd aabdVar, zxy zxyVar, aaqu aaquVar) {
        super(ytiVar, aaquVar.e, 1);
        this.k = zxyVar;
        aarb aarbVar = new aarb(context, zxyVar, aaakVar);
        this.f = aarbVar;
        final aabp aabpVar = aaquVar.f;
        if (aabpVar != null) {
            aaqa aaqaVar = new aaqa() { // from class: aard
                @Override // defpackage.aaqa
                public final void a(amqe amqeVar) {
                    aabp.this.r(amqeVar);
                }
            };
            this.d = aaqaVar;
            ContentGridView contentGridView = aaquVar.g;
            int i = aaquVar.e;
            mci mciVar = (mci) zmeVar.c.b();
            aabd aabdVar2 = (aabd) zmeVar.b.b();
            aabdVar2.getClass();
            aaak aaakVar2 = (aaak) zmeVar.a.b();
            contentGridView.getClass();
            this.c = new aarc(mciVar, aabdVar2, aaakVar2, aarbVar, aaqaVar, contentGridView, i);
            this.g = aabdVar;
            return;
        }
        throw new IllegalArgumentException("ConversationInputBase cannot be null!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.aabc
    public final void K(zxy zxyVar) {
        aarb aarbVar = this.f;
        if (aarbVar.c) {
            aarbVar.b(zxyVar.d);
            r().p();
        }
    }

    @Override // defpackage.aaqd
    public final int a() {
        return R.dimen.emoji_content_item_height;
    }

    @Override // defpackage.aaqd
    public final int b() {
        return R.string.c2o_category_emoji_content_description;
    }

    @Override // defpackage.aaqd
    protected final int c() {
        return R.drawable.ic_insert_emoticon_white;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.aaqd
    public final void f(Bundle bundle) {
        this.g.d();
        this.k.f(this);
        this.f.b(this.k.d);
    }

    @Override // defpackage.aaqd
    public final void g() {
        this.k.h(this);
        this.g.e();
    }

    @Override // defpackage.aaqo
    public final void i() {
        this.d.a(amqe.CATEGORY_HEADER);
    }

    @Override // defpackage.aaqm
    protected final int j() {
        return R.string.c2o_category_name_emojis;
    }

    @Override // defpackage.aaqd
    public final void q(aapu aapuVar) {
        this.h = aapuVar;
        this.c.a = this.h;
    }

    @Override // defpackage.aaqm
    protected final aapy r() {
        if (this.e == null) {
            this.e = new aara(this.c);
        }
        return this.e;
    }

    @Override // defpackage.aaqm
    protected final aapz s() {
        return this.c;
    }
}
