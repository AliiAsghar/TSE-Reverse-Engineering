package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eog {
    public static final List a = aqil.o(new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class});
    public final Map b;
    public final Map c;
    public final Map d;
    public final gjy e;
    private final Map f;

    public eog() {
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.e = new gjy() { // from class: eoe
            @Override // defpackage.gjy
            public final Bundle a() {
                eog eogVar = eog.this;
                for (Map.Entry entry : aqjn.r(eogVar.c).entrySet()) {
                    eogVar.c((String) entry.getKey(), ((gjy) entry.getValue()).a());
                }
                armo[] armoVarArr = {new armo("keys", new ArrayList(eogVar.b.keySet())), new armo("values", new ArrayList(eogVar.b.values()))};
                Bundle bundle = new Bundle(2);
                for (int i = 0; i < 2; i++) {
                    armo armoVar = armoVarArr[i];
                    String str = (String) armoVar.a;
                    Object obj = armoVar.b;
                    if (obj == null) {
                        bundle.putString(str, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str, (Serializable) obj);
                        } else {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) obj);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                return bundle;
            }
        };
    }

    public final Object a(String str) {
        str.getClass();
        try {
            return this.b.get(str);
        } catch (ClassCastException unused) {
            b(str);
            return null;
        }
    }

    public final Object b(String str) {
        str.getClass();
        Object remove = this.b.remove(str);
        if (((eof) this.d.remove(str)) == null) {
            this.f.remove(str);
            return remove;
        }
        throw null;
    }

    public final void c(String str, Object obj) {
        eny enyVar;
        str.getClass();
        if (obj != null) {
            List list = a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.d.get(str);
        if (obj2 instanceof eny) {
            enyVar = (eny) obj2;
        } else {
            enyVar = null;
        }
        if (enyVar != null) {
            enyVar.j(obj);
        } else {
            this.b.put(str, obj);
        }
        ascd ascdVar = (ascd) this.f.get(str);
        if (ascdVar == null) {
            return;
        }
        ascdVar.f(obj);
    }

    public final void d(String str, gjy gjyVar) {
        this.c.put(str, gjyVar);
    }

    public eog(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.e = new gjy() { // from class: eoe
            @Override // defpackage.gjy
            public final Bundle a() {
                eog eogVar = eog.this;
                for (Map.Entry entry : aqjn.r(eogVar.c).entrySet()) {
                    eogVar.c((String) entry.getKey(), ((gjy) entry.getValue()).a());
                }
                armo[] armoVarArr = {new armo("keys", new ArrayList(eogVar.b.keySet())), new armo("values", new ArrayList(eogVar.b.values()))};
                Bundle bundle = new Bundle(2);
                for (int i = 0; i < 2; i++) {
                    armo armoVar = armoVarArr[i];
                    String str = (String) armoVar.a;
                    Object obj = armoVar.b;
                    if (obj == null) {
                        bundle.putString(str, null);
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
                        bundle.putByte(str, ((Number) obj).byteValue());
                    } else if (obj instanceof Character) {
                        bundle.putChar(str, ((Character) obj).charValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Short) {
                        bundle.putShort(str, ((Number) obj).shortValue());
                    } else if (obj instanceof Bundle) {
                        bundle.putBundle(str, (Bundle) obj);
                    } else if (obj instanceof CharSequence) {
                        bundle.putCharSequence(str, (CharSequence) obj);
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str, (Parcelable) obj);
                    } else if (obj instanceof boolean[]) {
                        bundle.putBooleanArray(str, (boolean[]) obj);
                    } else if (obj instanceof byte[]) {
                        bundle.putByteArray(str, (byte[]) obj);
                    } else if (obj instanceof char[]) {
                        bundle.putCharArray(str, (char[]) obj);
                    } else if (obj instanceof double[]) {
                        bundle.putDoubleArray(str, (double[]) obj);
                    } else if (obj instanceof float[]) {
                        bundle.putFloatArray(str, (float[]) obj);
                    } else if (obj instanceof int[]) {
                        bundle.putIntArray(str, (int[]) obj);
                    } else if (obj instanceof long[]) {
                        bundle.putLongArray(str, (long[]) obj);
                    } else if (obj instanceof short[]) {
                        bundle.putShortArray(str, (short[]) obj);
                    } else if (obj instanceof Object[]) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str, (Parcelable[]) obj);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str, (String[]) obj);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str, (Serializable) obj);
                        } else {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                        }
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str, (Serializable) obj);
                    } else if (obj instanceof IBinder) {
                        bundle.putBinder(str, (IBinder) obj);
                    } else if (obj instanceof Size) {
                        bundle.putSize(str, (Size) obj);
                    } else if (obj instanceof SizeF) {
                        bundle.putSizeF(str, (SizeF) obj);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                    }
                }
                return bundle;
            }
        };
        linkedHashMap.putAll(map);
    }
}
