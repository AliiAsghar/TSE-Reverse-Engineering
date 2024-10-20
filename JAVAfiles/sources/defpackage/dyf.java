package defpackage;

import android.app.Notification;
import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.Surface;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Notification.Action action) {
        boolean allowGeneratedReplies;
        allowGeneratedReplies = action.getAllowGeneratedReplies();
        return allowGeneratedReplies;
    }

    public static Person b(dzv dzvVar) {
        Person.Builder name;
        Icon icon;
        Person.Builder icon2;
        Person.Builder uri;
        Person.Builder key;
        Person.Builder bot;
        Person.Builder important;
        Person build;
        name = new Person.Builder().setName(dzvVar.a);
        IconCompat iconCompat = dzvVar.b;
        if (iconCompat != null) {
            icon = iconCompat.c();
        } else {
            icon = null;
        }
        icon2 = name.setIcon(icon);
        uri = icon2.setUri(dzvVar.c);
        key = uri.setKey(dzvVar.d);
        bot = key.setBot(dzvVar.e);
        important = bot.setImportant(dzvVar.f);
        build = important.build();
        return build;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dzv c(Person person) {
        CharSequence name;
        Icon icon;
        IconCompat iconCompat;
        String uri;
        String key;
        boolean isBot;
        boolean isImportant;
        Icon icon2;
        dzu dzuVar = new dzu();
        name = person.getName();
        dzuVar.a = name;
        icon = person.getIcon();
        if (icon == null) {
            iconCompat = null;
        } else {
            icon2 = person.getIcon();
            iconCompat = dzd.h(icon2);
        }
        dzuVar.b = iconCompat;
        uri = person.getUri();
        dzuVar.c = uri;
        key = person.getKey();
        dzuVar.d = key;
        isBot = person.isBot();
        dzuVar.e = isBot;
        isImportant = person.isImportant();
        dzuVar.f = isImportant;
        return new dzv(dzuVar);
    }

    public static void d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof ebe) {
            ((ebe) menuItem).b(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof ebe) {
            ((ebe) menuItem).setIconTintList(colorStateList);
        } else {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static float f(alog alogVar, eqn eqnVar) {
        int i;
        int i2;
        int i3 = eqnVar.y % 180;
        if (i3 == 0) {
            i = eqnVar.v;
        } else {
            i = eqnVar.w;
        }
        if (i3 == 0) {
            i2 = eqnVar.w;
        } else {
            i2 = eqnVar.v;
        }
        float f = 0.0f;
        for (int i4 = 0; i4 < alogVar.size(); i4++) {
            eqk eqkVar = (eqk) alogVar.get(i4);
            if (!(eqkVar instanceof exr)) {
                return -1.0f;
            }
            exr exrVar = (exr) eqkVar;
            if (eqkVar instanceof eyp) {
                eyp eypVar = (eyp) eqkVar;
                float f2 = eypVar.a;
                float f3 = eypVar.b;
                float f4 = eypVar.c;
                if (f4 % 90.0f != brg.a) {
                    return -1.0f;
                }
                f += f4;
                float f5 = f % 180.0f;
                if (f5 == brg.a) {
                    i = eqnVar.v;
                } else {
                    i = eqnVar.w;
                }
                if (f5 == brg.a) {
                    i2 = eqnVar.w;
                } else {
                    i2 = eqnVar.v;
                }
            } else if (!exrVar.e(i, i2)) {
                return -1.0f;
            }
        }
        float f6 = f % 360.0f;
        if (f6 % 90.0f != brg.a) {
            return -1.0f;
        }
        return f6;
    }

    public static int g(String str) {
        int b = erl.b(str);
        if (b == 4) {
            return 2;
        }
        return b;
    }

    public static eqd h(eqd eqdVar, boolean z) {
        if (z && eqd.i(eqdVar)) {
            return eqd.a;
        }
        return eqdVar;
    }

    public static eqd i(eqd eqdVar) {
        if (eqdVar != null && eqdVar.g()) {
            return eqdVar;
        }
        return eqd.a;
    }

    public static final void j(String str, fuy fuyVar) {
        dzg.e(fuyVar.a(erl.b(str)).contains(str), "Unsupported sample MIME type ".concat(str));
    }

    public static Surface k() {
        throw new UnsupportedOperationException();
    }

    public static int l() {
        throw new UnsupportedOperationException();
    }

    public static int m() {
        throw new UnsupportedOperationException();
    }

    public static boolean n() {
        throw new UnsupportedOperationException();
    }

    public static void o() {
        throw new UnsupportedOperationException();
    }
}
