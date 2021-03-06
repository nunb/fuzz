(ns cljs.fuzz.inprog)


      ;; <section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
      ;;   <div class="mdl-card mdl-cell mdl-cell--9-col-desktop">
      ;;     <div class="mdl-card__title">
      ;;       <h4>Lets rock</h4>
      ;;     </div>
      ;;   </div>
      ;; </section>


#_(defn gh-project-component [{:keys [name description stargazers_count]}]
  [:div.mdl-cell.mdl-cell--3-col.mdl-cell--4-col-tablet.mdl-cell--4-col-phone.mdl-card.mdl-shadow--3dp
   [:div.mdl-card__title
    [:h4.mdl-card__title-text name (str " (" stargazers_count ")")]]
   [:div.mdl-card__supporting-text
    [:span.mdl-typography--font-light.mdl-typography--subhead description]]

   [:div.mdl-card__actions
    [:a.android-link.mdl-button.mdl-js-button.mdl-typography--text-uppercase {:href ""}
     "Read More"
     [:i.material-icons "chevron_right"]]]])
