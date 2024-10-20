package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wnn implements wnp {
    private static final xze a = xze.g("Bugle", "RcsFlagPattern");
    protected final xyd d = new xyd(new uea(this, 19));

    protected abstract String b();

    public final alog d() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            int i = alog.d;
            return alsx.a;
        }
        String[] split = b.split("\n");
        alob alobVar = new alob();
        for (String str : split) {
            if (!str.equals("")) {
                try {
                    alobVar.h(Pattern.compile(str));
                } catch (PatternSyntaxException e) {
                    xyo b2 = a.b();
                    b2.H("compilePatterns: Skipping bad expression:");
                    b2.H(str);
                    b2.r(e);
                }
            }
        }
        return alobVar.g();
    }

    public final void e() {
        this.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wnp
    public final boolean f(CharSequence charSequence) {
        alog alogVar = (alog) this.d.get();
        int size = alogVar.size();
        int i = 0;
        while (i < size) {
            boolean matches = ((Pattern) alogVar.get(i)).matcher(charSequence).matches();
            i++;
            if (matches) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wnp
    public /* synthetic */ akul fO(CharSequence charSequence, int i) {
        return aktp.ag(false);
    }
}
