package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akmt extends hls {
    public akmt(hkz hkzVar, hwa hwaVar, hwi hwiVar, Context context) {
        super(hkzVar, hwaVar, hwiVar, context);
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ hlp a(Class cls) {
        return new akms(this.b, this, cls, this.c);
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ hlp d(Drawable drawable) {
        return (akms) c().g(drawable);
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ hlp e(Uri uri) {
        return (akms) super.e(uri);
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ hlp f(Object obj) {
        return (akms) super.f(obj);
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ hlp g(String str) {
        return (akms) super.g(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hls
    public final void p(hxc hxcVar) {
        if (hxcVar instanceof akmr) {
            super.p(hxcVar);
        } else {
            super.p(new akmr().p(hxcVar));
        }
    }

    @Override // defpackage.hls
    public final /* bridge */ /* synthetic */ void s(Integer num) {
    }

    @Override // defpackage.hls
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final akms b() {
        return (akms) super.b();
    }

    @Override // defpackage.hls
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final akms c() {
        return (akms) super.c();
    }

    public final akms v() {
        return (akms) a(File.class).p(hls.a);
    }
}
