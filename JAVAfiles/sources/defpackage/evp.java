package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Pair;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class evp implements algy {
    private final /* synthetic */ int a;

    public /* synthetic */ evp(int i) {
        this.a = i;
    }

    @Override // defpackage.algy
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                if (((String) obj) == null) {
                    return false;
                }
                return true;
            case 1:
                if (((Map.Entry) obj).getKey() == null) {
                    return false;
                }
                return true;
            case 2:
                if (obj instanceof etd) {
                    return false;
                }
                return true;
            case 3:
                if (!(obj instanceof AbsoluteSizeSpan) && !(obj instanceof RelativeSizeSpan)) {
                    return false;
                }
                return true;
            case 4:
                Exception exc = (Exception) obj;
                alwo alwoVar = puo.a;
                if (!(exc instanceof psx) || !((psx) exc).a) {
                    return false;
                }
                return true;
            case 5:
                Exception exc2 = (Exception) obj;
                alwo alwoVar2 = xdq.a;
                if (!(exc2 instanceof aniv) || anis.a.equals(((aniv) exc2).a.c)) {
                    return false;
                }
                return true;
            case 6:
                utz utzVar = ylr.a;
                return ((Exception) obj) instanceof ajny;
            case 7:
                if ((((aovj) obj).b & 16) == 0) {
                    return false;
                }
                return true;
            case 8:
                if (((agvd) obj).b != 1) {
                    return false;
                }
                return true;
            case 9:
                if (((agvd) obj).b != 2) {
                    return false;
                }
                return true;
            case 10:
                if (((agvd) obj).b != 2) {
                    return false;
                }
                return true;
            case 11:
                if (((agvd) obj).b != 1) {
                    return false;
                }
                return true;
            case 12:
                return true;
            case 13:
                if (((ajyz) obj).a) {
                    return false;
                }
                return true;
            case 14:
                if (((Pair) obj).second == null) {
                    return false;
                }
                return true;
            case 15:
                return ((Context) obj) instanceof apxq;
            case 16:
                return ((Context) obj) instanceof aklm;
            case 17:
                alvi alviVar = akpa.a;
                return ((String) obj).startsWith("com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker");
            default:
                return ((Throwable) obj) instanceof SQLiteDatabaseLockedException;
        }
    }
}
