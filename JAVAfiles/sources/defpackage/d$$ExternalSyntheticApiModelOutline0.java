package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.util.GregorianCalendar;
import android.net.ConnectivityManager;
import android.os.LocaleList;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.os.health.TimerStat;
import android.os.storage.StorageVolume;
import android.view.PointerIcon;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ int m(Supplier supplier) {
        return supplier.hashCode();
    }

    public static /* bridge */ /* synthetic */ GregorianCalendar m(Object obj) {
        return (GregorianCalendar) obj;
    }

    public static /* bridge */ /* synthetic */ LocaleList m(Configuration configuration) {
        return configuration.getLocales();
    }

    public static /* bridge */ /* synthetic */ LocaleList m(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ HealthStats m317m(Object obj) {
        return (HealthStats) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ SystemHealthManager m318m(Object obj) {
        return (SystemHealthManager) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ TimerStat m320m(Object obj) {
        return (TimerStat) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ StorageVolume m321m(Object obj) {
        return (StorageVolume) obj;
    }

    public static /* bridge */ /* synthetic */ PointerIcon m(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Class m323m() {
        return CompletableFuture.class;
    }

    public static /* bridge */ /* synthetic */ Object m(Function function, Object obj) {
        return function.apply(obj);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ String m326m(LocaleList localeList) {
        return localeList.toLanguageTags();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Function m329m(Object obj) {
        return (Function) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Supplier m330m(Object obj) {
        return (Supplier) obj;
    }

    public static /* bridge */ /* synthetic */ void m(Configuration configuration, LocaleList localeList) {
        configuration.setLocales(localeList);
    }

    public static /* bridge */ /* synthetic */ void m(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }

    public static /* bridge */ /* synthetic */ void m(Consumer consumer, Object obj) {
        consumer.accept(obj);
    }

    public static /* bridge */ /* synthetic */ boolean m(Activity activity) {
        return activity.isInMultiWindowMode();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m334m(Object obj) {
        return obj instanceof GregorianCalendar;
    }

    public static /* bridge */ /* synthetic */ boolean m(Predicate predicate, Object obj) {
        return predicate.test(obj);
    }

    public static /* bridge */ /* synthetic */ boolean m(Supplier supplier, Object obj) {
        return supplier.equals(obj);
    }
}
