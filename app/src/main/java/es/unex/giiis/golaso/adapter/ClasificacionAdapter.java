package es.unex.giiis.golaso.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import es.unex.giiis.golaso.R;
import es.unex.giiis.golaso.model.Equipo;

public class ClasificacionAdapter  extends RecyclerView.Adapter<ClasificacionAdapter.ViewHolder> {

    Context context;
    List<Equipo> equipos;

    public ClasificacionAdapter(Context context, List<Equipo> responseList) {
        this.context = context;
        this.equipos = responseList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_clasificacion_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClasificacionAdapter.ViewHolder holder, int position) {
        if (equipos != null && equipos.size() > 0) {
            Equipo equipo = equipos.get(position);
            holder.tVPos.setText(String.valueOf(equipo.getPosicion()));
            //Picasso.with(context).load(equipo.);
            holder.tVNombreEquipo.setText(String.valueOf(equipo.getNombre()));
            holder.tVPartidos.setText(String.valueOf(equipo.getPj()));
            holder.tVGoles.setText(String.valueOf(equipo.getGf()) + ":" + String.valueOf(equipo.getGc()));
            holder.tVPuntos.setText(String.valueOf(equipo.getPt()));
        }
        else {
            return;
        }
    }
    ///////

    @Override
    public int getItemCount() {
        return equipos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tVPos, tVNombreEquipo, tVPartidos, tVGoles, tVPuntos;
        ImageView iVEscudoEquipo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tVPos = itemView.findViewById(R.id.tVPos);
            iVEscudoEquipo = itemView.findViewById(R.id.iVEscudoEquipo);
            tVNombreEquipo = itemView.findViewById(R.id.tVNombreEquipo);
            tVPartidos = itemView.findViewById(R.id.tVPartidos);
            tVGoles = itemView.findViewById(R.id.tVGoles);
            tVPuntos = itemView.findViewById(R.id.tVPuntos);
        }
    }
}
