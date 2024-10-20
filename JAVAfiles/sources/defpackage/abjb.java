package defpackage;

import android.content.SharedPreferences;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjb extends abja implements abjd {
    final /* synthetic */ alpt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abjb(abjc abjcVar, alpt alptVar) {
        super(abjcVar, "active_sim_ids");
        this.a = alptVar;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ Object b(SharedPreferences sharedPreferences) {
        Set<String> stringSet = sharedPreferences.getStringSet(this.c, this.a);
        if (stringSet != null) {
            return alpt.o(stringSet);
        }
        return null;
    }

    @Override // defpackage.abja
    protected final /* bridge */ /* synthetic */ void c(SharedPreferences.Editor editor, Object obj) {
        Set<String> set = (Set) obj;
        if (set != null) {
            editor.putStringSet(this.c, set);
            return;
        }
        throw new IllegalArgumentException("null cannot be written for Set<String>");
    }

    @Override // defpackage.abja
    public final /* bridge */ /* synthetic */ Object d() {
        Set set = (Set) super.d();
        if (set != null) {
            return alpt.o(set);
        }
        return null;
    }
}
