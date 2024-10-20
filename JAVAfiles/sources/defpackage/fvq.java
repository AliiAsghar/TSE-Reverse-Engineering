package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvq {
    public final Object a;
    public final Object b;

    public fvq(int i, int i2) {
        this.b = new int[]{i, i2};
        this.a = new float[]{brg.a, 1.0f};
    }

    public static void c(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static final KeyListener m(KeyListener keyListener) {
        if (keyListener instanceof ekj) {
            return keyListener;
        }
        return new ekj(keyListener);
    }

    public static /* synthetic */ List p(Object[] objArr) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        obj.getClass();
        arrayList.add(obj);
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static final boolean r(String str, String str2) {
        String b = FileProvider.b(str);
        String b2 = FileProvider.b(str2);
        if (!b.equals(b2)) {
            if (!b.startsWith(b2 + '/')) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean A(oo ooVar) {
        qg qgVar = (qg) ((vl) this.b).get(ooVar);
        if (qgVar != null && (qgVar.b & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [qf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [qf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [qf, java.lang.Object] */
    public final View B(int i, int i2, int i3, int i4) {
        int i5;
        ?? r0 = this.b;
        int d = r0.d();
        int c = r0.c();
        View view = null;
        int i6 = i;
        while (i6 != i2) {
            ?? r4 = this.b;
            View e = r4.e(i6);
            ((qe) this.a).c(d, c, r4.b(e), this.b.a(e));
            ((qe) this.a).b();
            ((qe) this.a).a(i3);
            qe qeVar = (qe) this.a;
            if (!qeVar.d()) {
                if (i4 != 0) {
                    qeVar.b();
                    ((qe) this.a).a(i4);
                    if (((qe) this.a).d()) {
                        view = e;
                    }
                }
                if (i2 > i) {
                    i5 = 1;
                } else {
                    i5 = -1;
                }
                i6 += i5;
            } else {
                return e;
            }
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [qf, java.lang.Object] */
    public final boolean C(View view) {
        Object obj = this.a;
        ?? r1 = this.b;
        ((qe) obj).c(r1.d(), r1.c(), r1.b(view), r1.a(view));
        ((qe) this.a).b();
        ((qe) this.a).a(24579);
        return ((qe) this.a).d();
    }

    public final void D(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((TextView) this.a).getContext().obtainStyledAttributes(attributeSet, gc.j, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            Object obj = this.b;
            boolean g = elp.g();
            elo eloVar = ((elp) ((efu) obj).a).b;
            eloVar.c = z;
            if (g) {
                return;
            }
            eloVar.h();
            eloVar.b.setFilters(eloVar.i(eloVar.b.getFilters()));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void E(boolean z) {
        if (!elp.g()) {
            Object obj = this.b;
            if (z) {
                ((elp) ((efu) obj).a).b.h();
            }
        }
    }

    public final InputFilter[] F(InputFilter[] inputFilterArr) {
        if (elp.g()) {
            return inputFilterArr;
        }
        return ((elp) ((efu) this.b).a).b.i(inputFilterArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void G(atal atalVar) {
        int i = atalVar.a;
        if (i == 0) {
            Object obj = atalVar.b;
            this.b.execute(new bn((dzm) this.a, (Typeface) obj, 16));
        } else {
            this.b.execute(new ebm(this.a, i, 0, null));
        }
    }

    public final void a(long j, euf eufVar) {
        if (eufVar.b() >= 9) {
            int e = eufVar.e();
            int e2 = eufVar.e();
            int j2 = eufVar.j();
            if (e == 434 && e2 == 1195456820 && j2 == 3) {
                eee.e(j, eufVar, (fmq[]) this.b);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    public final void b(flw flwVar, fuq fuqVar) {
        for (int i = 0; i < ((fmq[]) this.b).length; i++) {
            fuqVar.c();
            fmq p = flwVar.p(fuqVar.a(), 3);
            eqn eqnVar = (eqn) this.a.get(i);
            String str = eqnVar.o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            d.t(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            eqm eqmVar = new eqm();
            eqmVar.a = fuqVar.b();
            eqmVar.b(str);
            eqmVar.e = eqnVar.e;
            eqmVar.d = eqnVar.d;
            eqmVar.G = eqnVar.I;
            eqmVar.p = eqnVar.r;
            p.h(new eqn(eqmVar));
            ((fmq[]) this.b)[i] = p;
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, flp] */
    public final flu d(Object... objArr) {
        Constructor a;
        synchronized (this.b) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    a = this.a.a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (flu) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public final void e(ezh ezhVar) {
        ezhVar.a();
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new fhh((Object) this, (Object) ezhVar, 4, (byte[]) null));
        }
    }

    public final void f(Object obj) {
        Object obj2 = this.a;
        if (obj2 != null) {
            SystemClock.elapsedRealtime();
            ((Handler) obj2).post(new fhh(this, obj, 3));
        }
    }

    public final void g(esn esnVar) {
        Object obj = this.a;
        if (obj != null) {
            ((Handler) obj).post(new fhh((Object) this, (Object) esnVar, 2, (byte[]) null));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void h(Throwable th) {
        this.a.execute(new bn(this, th, 18, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void i() {
        this.a.execute(new ou(this, 18, null));
    }

    public final void j() {
        TransformationMethod transformationMethod = ((TextView) this.b).getTransformationMethod();
        if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
            Object obj = this.b;
            if (!(transformationMethod instanceof ekm)) {
                transformationMethod = new ekm(transformationMethod);
            }
            ((TextView) obj).setTransformationMethod(transformationMethod);
        }
    }

    public final InputConnection k(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        if (inputConnection instanceof ekh) {
            return inputConnection;
        }
        return new ekh((TextView) this.a, inputConnection, editorInfo);
    }

    public final void l(int i) {
        dye.h(i, "maxEmojiCount should be greater than 0");
        ((ekl) this.b).a = i;
    }

    public final void n(final Runnable runnable) {
        ((Choreographer) this.b).postFrameCallback(new Choreographer.FrameCallback() { // from class: ejg
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, apbt] */
    public final Object o(InputStream inputStream) {
        try {
            Object g = this.a.getParserForType().g(inputStream, (aozs) this.b);
            g.getClass();
            return g;
        } catch (apba e) {
            throw new ehm(e);
        }
    }

    public final File q(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) ((HashMap) this.b).get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (r(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                file2.toString();
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file2.toString()));
            }
        }
        Objects.toString(uri);
        throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
    }

    public final ns s(oo ooVar, int i) {
        qg qgVar;
        ns nsVar;
        int c = ((vl) this.b).c(ooVar);
        if (c >= 0 && (qgVar = (qg) ((vl) this.b).g(c)) != null) {
            int i2 = qgVar.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                qgVar.b = i3;
                if (i == 4) {
                    nsVar = qgVar.c;
                } else if (i == 8) {
                    nsVar = qgVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((vl) this.b).e(c);
                    qg.b(qgVar);
                }
                return nsVar;
            }
        }
        return null;
    }

    public final void t(oo ooVar) {
        qg qgVar = (qg) ((vl) this.b).get(ooVar);
        if (qgVar == null) {
            Object obj = this.b;
            qg a = qg.a();
            ((vl) obj).put(ooVar, a);
            qgVar = a;
        }
        qgVar.b |= 1;
    }

    public final void u(long j, oo ooVar) {
        ((uj) this.a).h(j, ooVar);
    }

    public final void v(oo ooVar, ns nsVar) {
        qg qgVar = (qg) ((vl) this.b).get(ooVar);
        if (qgVar == null) {
            Object obj = this.b;
            qg a = qg.a();
            ((vl) obj).put(ooVar, a);
            qgVar = a;
        }
        qgVar.d = nsVar;
        qgVar.b |= 8;
    }

    public final void w(oo ooVar, ns nsVar) {
        qg qgVar = (qg) ((vl) this.b).get(ooVar);
        if (qgVar == null) {
            Object obj = this.b;
            qg a = qg.a();
            ((vl) obj).put(ooVar, a);
            qgVar = a;
        }
        qgVar.c = nsVar;
        qgVar.b |= 4;
    }

    public final void x() {
        ((vl) this.b).clear();
        ((uj) this.a).g();
    }

    public final void y(oo ooVar) {
        qg qgVar = (qg) ((vl) this.b).get(ooVar);
        if (qgVar == null) {
            return;
        }
        qgVar.b &= -2;
    }

    public final void z(oo ooVar) {
        int b = ((uj) this.a).b();
        while (true) {
            b--;
            if (b < 0) {
                break;
            }
            if (ooVar == ((uj) this.a).e(b)) {
                uj ujVar = (uj) this.a;
                Object[] objArr = ujVar.c;
                Object obj = objArr[b];
                Object obj2 = uk.a;
                if (obj != obj2) {
                    objArr[b] = obj2;
                    ujVar.a = true;
                }
            }
        }
        qg qgVar = (qg) ((vl) this.b).remove(ooVar);
        if (qgVar != null) {
            qg.b(qgVar);
        }
    }

    public fvq(int i, int i2, int i3) {
        this.b = new int[]{i, i2, i3};
        this.a = new float[]{brg.a, 0.5f, 1.0f};
    }

    public fvq(Handler handler, faa faaVar) {
        this.a = faaVar == null ? null : handler;
        this.b = faaVar;
    }

    public fvq(TextView textView) {
        this.b = textView;
        this.a = new eki(textView);
    }

    public fvq(TextView textView, byte[] bArr) {
        this.a = textView;
        this.b = new efu(textView);
    }

    public fvq(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public fvq(Object obj, Object obj2, byte[] bArr) {
        this.a = obj;
        this.b = obj2;
    }

    public fvq(Object obj, Object obj2, char[] cArr) {
        this.a = obj;
        this.b = obj2;
    }

    public fvq(Executor executor, dyp dypVar) {
        this.b = dypVar;
        this.a = executor;
    }

    public fvq(qf qfVar) {
        this.b = qfVar;
        this.a = new qe();
    }

    public fvq(EditText editText) {
        this.a = editText;
        elr elrVar = new elr(editText);
        this.b = elrVar;
        editText.addTextChangedListener(elrVar);
        editText.setEditableFactory(elj.a());
    }

    public fvq(esa esaVar, int... iArr) {
        this(esaVar, iArr, (byte[]) null);
    }

    public fvq(flp flpVar) {
        this.a = flpVar;
        this.b = new AtomicBoolean(false);
    }

    public fvq(String str) {
        this.b = new HashMap();
        this.a = str;
    }

    public fvq(List list, List list2) {
        int size = list.size();
        this.b = new int[size];
        this.a = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.a)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public fvq(byte[] bArr, byte[] bArr2) {
        this.b = new vl();
        this.a = new uj();
    }

    public fvq() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.b = byteArrayOutputStream;
        this.a = new DataOutputStream(byteArrayOutputStream);
    }

    public fvq(esa esaVar, int[] iArr, byte[] bArr) {
        if (iArr.length == 0) {
            eub.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = esaVar;
        this.b = iArr;
    }

    public fvq(evf evfVar) {
        d.s(true);
        this.a = evfVar;
        this.b = new HashMap();
    }

    public fvq(List list) {
        this.a = list;
        this.b = new fmq[list.size()];
    }

    public fvq(Context context) {
        this.a = context.getApplicationContext();
        this.b = ffj.a;
    }

    public fvq(apbt apbtVar, aozs aozsVar) {
        aozsVar.getClass();
        this.a = apbtVar;
        this.b = aozsVar;
    }

    public fvq(arwe arweVar, arqr arqrVar, arqv arqvVar) {
        this.b = arweVar;
        this.a = arhi.t(Integer.MAX_VALUE, 0, 6);
        new efu((char[]) null, (byte[]) null, (byte[]) null);
        arxm arxmVar = (arxm) arweVar.b().get(arxm.c);
        if (arxmVar != null) {
            arxmVar.s(new eiw((Object) arqrVar, (Object) this, (Object) arqvVar, 0, (short[]) null));
        }
    }

    public fvq(byte[] bArr) {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }

    public fvq(EditText editText, byte[] bArr) {
        this.a = editText;
        ekl eklVar = new ekl(editText);
        this.b = eklVar;
        editText.addTextChangedListener(eklVar);
        editText.setEditableFactory(ekg.a());
    }
}
